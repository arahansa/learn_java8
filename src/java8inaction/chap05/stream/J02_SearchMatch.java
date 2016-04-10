package java8inaction.chap05.stream;

import java8inaction.common.Dish;
import java8inaction.common.DishHolder;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by arahansa on 2016-04-10.
 */
public class J02_SearchMatch {

    @Test
    public void 채식주의자있는지검사_anyMatch(){
        if(DishHolder.dishes.stream().anyMatch(Dish::isVegetarian)){
            System.out.println("채식주의자가 있네요?");
        }
    }

    @Test
    public void 모든요소와일치검사_allMatch(){
        boolean allMatch = DishHolder.dishes.stream().allMatch(n -> n.getCalories() < 1000);
        System.out.println("일치하는지 여부  "+allMatch);
        assertTrue(allMatch);
    }
    @Test
    public void 하나도일치하지않는지검사_noneMatch(){
        boolean b = DishHolder.dishes.stream().noneMatch(n -> n.getCalories() >= 1000);
        System.out.println("하나도 일치하지 않는지 여부  "+b);
        assertTrue(b);
    }


}
