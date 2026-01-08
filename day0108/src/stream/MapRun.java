package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapRun {
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		Function<String, Integer> strLen = String::length; //이중 콜론 연산자
		//이중콜론 예시 : (x, y) -> Math.max(x, y) ==> Math::max;
		
		List<Integer> length = words.stream().map(strLen).collect(Collectors.toList());
		System.out.println("length = " + length);
	}
}