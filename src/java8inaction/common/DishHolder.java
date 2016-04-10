package java8inaction.common;

import java8inaction.chap05.stream.Type;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * Created by arahansa on 2016-04-10.
 */
@Data
public class DishHolder {

    public static List<Dish> dishes = Arrays.asList(
            new Dish(Type.MEAT, 500, true, "gogi"), new Dish(Type.SALAD, 200, false, "salad"),
            new Dish(Type.SALAD, 200, false, "pizza"), new Dish(Type.SALAD, 200, false, "yangpa"),
            new Dish(Type.MEAT, 400, true, "salsa"), new Dish(Type.MEAT, 300, true, "yangpa")
    );
}
