package com.wipro.Java.LambdaExpressions;

interface Add {
    int sum(int a, int b);
}

public class Ex3 {
    public static void main(String[] args) {

        Add obj = (a, b) -> a + b;

        System.out.println(obj.sum(5, 3));
    }
}


