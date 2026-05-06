package com.wipro.Java.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {

		List<String> emplist = new ArrayList<String>();

		emplist.add("siri");
		emplist.add("vani");
		emplist.add("rakshi");
		emplist.add("sneha");

		for (String element : emplist) {         // List Example by using the for each loop
			if (element.startsWith("s"))
				System.out.println(element);
			
		}
		System.out.println("First element: " + emplist.getFirst());
		System.out.println("Element at index 3: " + emplist.get(3));

		List<Integer> emplist2 = new ArrayList<Integer>();

		emplist2.add(23);
		emplist2.add(45);
		emplist2.add(33);
		for (int element : emplist2) {

			System.out.println(element);
		}

	}
}
