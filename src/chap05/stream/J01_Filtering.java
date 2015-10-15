package chap05.stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class J01_Filtering {
	
	public static void main(String[] args) {
		// 중복 비교 
		List<Integer> numbers = Arrays.asList(1,2, 1,3,3,2,4);
		numbers.stream()
			.filter(i->i%2==0)
			.distinct()
			//.skip(2)
			//.limit(3)
			.forEach(System.out::println);
		
		List<Dish> dishes = Arrays.asList(
				new Dish(Type.MEAT, 500, true, "gogi"), new Dish(Type.SALAD, 200, false, "salad"),
				new Dish(Type.SALAD, 200, false, "pizza"), new Dish(Type.SALAD, 200, false, "yangpa"),
				new Dish(Type.MEAT, 400, true, "salsa"), new Dish(Type.MEAT, 300, true, "yangpa")
				);
		
		System.out.println("베지테리언 음식 출력");
		dishes.stream()
			.filter(Dish::isVegetarian)
			.collect(Collectors.toList())
			.forEach(System.out::println);;
		
		System.out.print("문자열 길이들 출력");
		String result = dishes
			.stream().map(Dish::getName).map(String::length).map(String::valueOf)
			.collect(joining(", "));
		System.out.println("결과 "+ result);
		
		
		// ["Hello", "World"]  를 "H","e","l", "o" 같은 걸로 받을려면?
		List<String> words = Arrays.asList("Hello", "World");
		List<String[]> collect = words.stream()
				.map(word-> word.split("")).distinct().collect(toList());
		System.out.println("첫번째 해결책"+collect); // 이것은 Stream<String[]>가 나온다.
		
		String[] arrayOfWords = {"GoodBye", "World"};
		Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
		
		// 이것도 좋은 해결책이 아님. 
		List<Stream<String>> collect2 = words.stream()
			.map(word-> word.split(""))
			.map(Arrays::stream)
			.distinct().collect(toList());
		System.out.println("스프릿된 어레이 "+collect2);
		
		// flatMap 이 각 배열을 스트림이 아니라 스트림의 콘텐츠로 매핑함. 
		List<String> collect3 = words.stream()
				.map(word-> word.split(""))
				.flatMap(Arrays::stream)
				.distinct().collect(toList());
		System.out.println("세번째 콜렉트"+collect3);
		
	}
	
	
	@Data
	@AllArgsConstructor
	public static class Dish{
		Type type;
		int calories;
		boolean vegetarian;
		String name;
		
	}
}
