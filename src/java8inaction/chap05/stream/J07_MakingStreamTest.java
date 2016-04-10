package java8inaction.chap05.stream;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by arahansa on 2016-04-10.
 */
public class J07_MakingStreamTest {
    @Test
    public void 스트림만들기() throws Exception{
        Stream<String> action = Stream.of("Java 8 ", "Lambdas ", "In ", "Action");
        action.map(String::toUpperCase).forEach(System.out::println);
    }
    @Test
    public void 파일스트림만들기() throws Exception{
        long uniqueWords=0;
        try(Stream<String> lines = Files.lines(Paths.get("data.txt") , Charset.defaultCharset())){
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" "))).distinct().count();
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("유니크 워드  : "+uniqueWords);
        assertEquals(2L, uniqueWords);
    }

    @Test
    public void 일부터백까지더하기() throws Exception{
        long count = IntStream.rangeClosed(1, 100).count();
        assertEquals(100L, count);
        int sum = IntStream.rangeClosed(1, 100).sum();
        assertEquals(5050L, sum);
    }

    @Test
    public void 무한스트림_iterate() throws Exception{
        // iterate 를 통한 무한스트림
        Stream.iterate(0, n -> n+2).limit(10).forEach(System.out::println);
    }

    @Test
    public void 무한스트림_generate() throws Exception{
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
    }



}