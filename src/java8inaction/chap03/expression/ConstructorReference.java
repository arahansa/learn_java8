package java8inaction.chap03.expression;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import lombok.Data;

public class ConstructorReference {

	public static void main(String[] args) {
		//생성자로 만드는게 가능하군?
		Supplier<Apple> c1 = Apple::new;
		Apple apple = c1.get();
		System.out.println("서플라이어로 만든 사과"+apple);
		
		
		Function<Integer, Apple> c2 = Apple::new;
		Apple a2 = c2.apply(110);
		System.out.println("펑션으로 만든 사과 "+a2);
		
		BiFunction<String, Integer, Apple> c3 = Apple::new;
		Apple a3 = c3.apply("green", 110);
		System.out.println("바이펑션으로 만든 사과"+a3);
		
	}
	
	@Data
	public static class Apple{
		private String color;
		private int weight;
		public Apple() {
			this.color="기본칼라";
			this.weight=160;
		}
		public Apple(int weight) {
			super();
			this.weight = weight;
		}
		public Apple(String color, int weight) {
			super();
			this.color = color;
			this.weight = weight;
		}
		
		
		
	}
	
}
