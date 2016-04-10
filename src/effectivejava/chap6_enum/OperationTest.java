package effectivejava.chap6_enum;

import static org.junit.Assert.*;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Created by jarvis on 16. 4. 10..
 */
@Slf4j
public class OperationTest {

    @Test
    public void 계산기_올드_테스트() throws Exception{
        log.info("계산기테스트");
        final double apply = OperationOld.PLUS.apply(1, 2);
        assertEquals(3L, apply,  0.01);
    }

    @Test
    public void 계산기_상수별클래스몸체_테스트() throws Exception{
        log.info("계산기_상수별클래스몸체_테스트");
        final double apply = OperationAbstract.PLUS.apply(1, 2);
        assertEquals(3L, apply, 0.01);
    }

}