package com.wipro.Java.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {

		List<String> emplist = new ArrayList<String>();

		emplist.add("chandu");
		emplist.add("chandana");
		emplist.add("siri");

		System.out.println(emplist);

		List list = new ArrayList(); // Object
		list.add(234);
		list.add("chandu");
		list.add(true);
		list.add(34.5f);
		
		System.out.println(list);

	}
}
