package etc.encrypt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import effectivejava.chap6_enum.OperationAbstract;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AESTest {

	@Test
    public void 계산기_상수별클래스몸체_테스트() throws Exception{
        log.info("계산기_상수별클래스몸체_테스트?");
        // String encryptString = AesEncryptCBC.encryptString("RAN/test/1000000001/ios");
        //1000000032
        String encryptString = AesEncryptCBC.encryptString("RAN/arahansa/1000000032/ios");
        log.info("enc : {}" , encryptString);
        log.info("desc : {}" , AesEncryptCBC.decryptString(encryptString));
        // 2ef0874929bd90e779534ce2963b92822e3b6d8b84a9b05ca1784ab2804b0399
        log.info("desc : {}" , AesEncryptCBC.decryptString("2ef0874929bd90e779534ce2963b92822e3b6d8b84a9b05ca1784ab2804b0399"));
    }
	
}

