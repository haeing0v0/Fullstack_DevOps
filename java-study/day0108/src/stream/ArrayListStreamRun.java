package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamRun {
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s + " "));
		System.out.println("==============end===============");
		
		sList.stream().sorted().forEach(s -> System.out.println(s + " "));
		System.out.println("==============end===============");
		sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
		sList.stream().map(s -> s.length() >= 5).forEach(s -> System.out.println(s));
		
//		for (String string : sList) {
//			System.out.println(string);
//		}
	}
}
