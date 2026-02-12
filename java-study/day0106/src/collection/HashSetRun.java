package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetRun {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		//set.add("HTML");
		set.add("HTML"); //중복을 허용하지 않는다.
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println(" " + element);
		}
		
		set.remove("HTML");
		set.remove("JDBC");
		System.out.println("총 객체 수 : " + set.size());
		
		for (String element : set) {
			System.out.println(" " + element);
		}
		
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
