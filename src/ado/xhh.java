package ado;

import java.util.ArrayList;
import java.util.List;

public class xhh {
	public static void main(String[] args) {
		List<String> list1 =new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		System.out.println(list1);
		List<String> list2 =new ArrayList<String>();
		list2.add("B");
		list2.add("C");
		System.out.println(list2);
		list1.retainAll(list2);
		
		System.out.println(list1);
	}
}
