package etc.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by KangYong on 2016-05-02.
 */
public class LamgdatDistinguishTest {

    @Test
    public void distinghuishTest() throws Exception{
        List<String> collect = Arrays.asList("test", "test", "test2", "test3").stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
