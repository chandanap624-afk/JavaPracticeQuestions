package com.wipro.Java.Collections;

	
//"Traversing ArrayList using ListIterator (forward and backward)"

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {

		List<String> emplist = new ArrayList<String>();

		emplist.add("Aakshi");
		emplist.add("Neha");
		emplist.add("Rohit");
		emplist.add("Akash");

		ListIterator<String> empItr = emplist.listIterator();

		// Traversing elements using next() method
		while (empItr.hasNext()) {
			System.out.println(empItr.next());
		}

		while (empItr.hasPrevious()) {
			System.out.println(empItr.previous());
		}
	}
}
