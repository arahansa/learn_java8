package etc.string;

import org.apache.commons.lang3.StringUtils;

public class IndexOfTest {

	public static void main(String[] args) {
		System.out.println(" 포함 여부 : "+StringUtils.containsAny("tt", "00", "tt", "33"));
		
		String requestURI = "test/getImage.do";
		String contenstView ="/contentsView.do";
		
		boolean mobile1 = true;
		boolean mobile2 = true;
		
		if((mobile1 || mobile2)
				&& ( ( requestURI.indexOf("/contentsView.do")<0 && requestURI.indexOf("/curation/view")<0 && requestURI.indexOf("/socialLearning/view")<0 )
				|| requestURI.indexOf("/mobile/") > -1 ) ) {
			System.out.println("send Redirect to this address : "+ requestURI);
		}
		System.out.println("test");
		System.out.println(" requestURI getImage.do " + requestURI.indexOf("/getImage.do"));
	}
}
