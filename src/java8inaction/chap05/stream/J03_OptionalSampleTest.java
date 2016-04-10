package java8inaction.chap05.stream;

import java8inaction.common.Dish;
import java8inaction.common.DishHolder;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by arahansa on 2016-04-10.
 */
public class J03_OptionalSampleTest {

    @Test
    public void test() throws Exception{
        DishHolder.dishes.stream().filter(Dish::isVegetarian).findAny().ifPresent(d -> System.out.println(d));
    }
}