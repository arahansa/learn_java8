package etc;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class KoreanByteTest {

	String koreanMSG = "일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십";
	String engMSG = "abcdefghijklmnopqrstuvwyzabcdefghijklmnopqrstuvwyzabcdefghijklmnopqrstuvwyzabcdefghijklmnopqrstuvwyzabcdefghijklmnopqrstuvwyz";

	// @Test
	public void koreanTest() throws Exception {
		assertEquals(1, 1);
		System.out.println("한글 바이트 수 :" + koreanMSG.getBytes().length);

	}

	// @Test
	public void byteDivide() throws Exception {
		String substring = StringUtils.substring(koreanMSG, 0, 1);
		System.out.println("서브스트링 :" + substring);
		substring = StringUtils.substring(koreanMSG, 1, 2);
		System.out.println("서브스트링 :" + substring);
		substring = StringUtils.substring(koreanMSG, 0, 30);

		System.out.println("서브스트링 :" + substring);
		substring = StringUtils.substring(engMSG, 0, 30);
		System.out.println("서브스트링 :" + substring);
	}

	// @Test
	public void koreanSubString() throws Exception {
		String korean = "한글입";
		String subString = subString(korean, 0, 3);
		System.out.println("한글 결과 : " + subString);
	}
	
	// @Test
	public void koreanCharacterTest() throws Exception{
		String korean ="한글입니다abc";
		byte[] bytTemp = korean.getBytes("UTF-8");
		int iLength = bytTemp.length;
		int iChar = (int) bytTemp[0];
		
		System.out.println("아이차 :"+iChar);
		byte[] copyOf = Arrays.copyOf(bytTemp, 3);
		System.out.println("한글길이 :"+iLength);
		
		String test = new String(bytTemp, "UTF-8");
		String test2 = new String(copyOf, "UTF-8");
		System.out.println("테스트 : "+ test+" , "+test2);
		
		
	}
	
	@Test
	public void koreanCheck2() throws Exception {
		String msg ="일이>삼사오육칠팔구십";
		byte[] test = msg.getBytes("UTF-8");
		System.out.println("총길이 :"+test.length);
		int lastPosition = 0;
		for(int i=0;i<20;i++){
			int iChar = (int) test[i];
			if ((iChar > 127) || (iChar < 0)) {
				// 한글의 경우(2byte 통과처리)
				// 한글은 2Byte이기 때문에 다음 글자는 볼것도 없이 스킵한다
				i+=2; // 한개 더 해서 3byte
			}
			if(i<20)
				lastPosition=i;
			System.out.println("현재 라스트 포지션 :"+ lastPosition);
		}
		lastPosition++;
		System.out.println("라스트 포지션 :"+lastPosition);
		
		System.out.println("서브스트링 :"+new String(test, 0, lastPosition));
	}
	
	private String hangulByte(){
		
		return "";
	}
	
	

	private String subString(String strData, int iStartPos, int iByteLength) {
		byte[] bytTemp = null;
		int iRealStart = 0;
		int iRealEnd = 0;
		int iLength = 0;
		int iChar = 0;

		try {
			// UTF-8로 변환하는경우 한글 2Byte, 기타 1Byte로 떨어짐
			bytTemp = strData.getBytes("UTF-8");
			iLength = bytTemp.length;
			System.out.println("아이렝스 :"+iLength);
			
			for (int iIndex = 0; iIndex < iLength; iIndex++) {
				if (iStartPos <= iIndex) {
					break;
				}
				iChar = (int) bytTemp[iIndex];
				if ((iChar > 127) || (iChar < 0)) {
					// 한글의 경우(2byte 통과처리)
					// 한글은 2Byte이기 때문에 다음 글자는 볼것도 없이 스킵한다
					iRealStart++;
					iIndex++;
				} else {
					// 기타 글씨(1Byte 통과처리)
					iRealStart++;
				}
			}

			iRealEnd = iRealStart;
			int iEndLength = iRealStart + iByteLength;
			for (int iIndex = iRealStart; iIndex < iEndLength; iIndex++) {
				iChar = (int) bytTemp[iIndex];
				if ((iChar > 127) || (iChar < 0)) {
					System.out.println("한글입니다!");
					// 한글의 경우(2byte 통과처리)
					// 한글은 2Byte이기 때문에 다음 글자는 볼것도 없이 스킵한다
					iRealEnd++;
					iIndex++;
				} else {
					// 기타 글씨(1Byte 통과처리)
					iRealEnd++;
				}
			}
		} catch (Exception e) {
			System.out.println("DEBUG" + e.getMessage());
		}

		return strData.substring(iRealStart, iRealEnd);
	}
}
