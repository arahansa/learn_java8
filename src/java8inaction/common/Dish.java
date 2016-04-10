package java8inaction.common;

import java8inaction.chap05.stream.Type;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by arahansa on 2016-04-10.
 */
@Data
@AllArgsConstructor
public class Dish {
    Type type;
    int calories;
    boolean vegetarian;
    String name;
}
