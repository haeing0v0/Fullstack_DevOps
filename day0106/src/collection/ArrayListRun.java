package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRun {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();

		list.add("Java"); //0
		list.add("JDBC"); //1
		list.add("HTML"); //2
		
		int size = list.size();
		System.out.println("size = " + size);
		
		String watch = list.get(1);
		System.out.println("watch = " + watch);
		
		for (int i = 0; i < list.size(); i++) {
			String strList = list.get(i);
			System.out.println((i + 1) + " " + strList);
		}
		
		list.remove(2);
		
		for (int i = 0; i < list.size(); i++) {
			String strList = list.get(i);
			System.out.println((i + 1) + " " + strList);
		}
		
	}
}
