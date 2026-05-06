package com.wipro.Java.Arrays;
import java.util.Scanner;

public class ArrayIndex {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();          // size of array
    int arr[] = new int[n];

    // input array elements
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int key = sc.nextInt();        // element to search

    int index = -1;

    // search element
    for(int i = 0; i < n; i++) {
        if(arr[i] == key) {
            index = i;
            break;
        }
    }

    System.out.println(index);
}
}
