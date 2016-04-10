package java8inaction.chap05.stream;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by arahansa on 2016-04-10.
 */
public class J04_ReducingTest {

    IntStream intStream = IntStream.rangeClosed(1, 10);

    @Test
    public void 리듀싱연습() throws Exception{
        int reduce = IntStream.rangeClosed(1, 10).reduce(0, (a, b) -> a + b);
        System.out.println("리듀스 : " + reduce);
        assertEquals(55, reduce);
    }
    @Test
    public void 초기값이없는리듀싱() throws Exception{
        OptionalInt reduce = IntStream.rangeClosed(1, 10).reduce((a, b) -> a + b);
        assertEquals(55, reduce.getAsInt());
        assertTrue(reduce.isPresent());
    }
    
    @Test
    public void 최대값과최소값() throws Exception{
        OptionalInt reduce = IntStream.rangeClosed(1, 10).reduce(Integer::max);
        assertEquals(10, reduce.getAsInt());

        OptionalInt minReduce = intStream.reduce(Integer::min);
        assertEquals(1, minReduce.getAsInt());
    }



}