package com.wipro.Java.LambdaExpressions;

import java.util.function.*;

class Student {
    String name;
    String id;

    Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name + " " + id;
    }
}

public class FunctionalAndLambda {
    public static void main(String[] args) {

        //  Consumer using Lambda
        Consumer<Student> cons = t -> System.out.println(t);

        cons.accept(new Student("Chandana", "123"));

        //  Supplier using Lambda
        Supplier<Student> supp = () -> new Student("Chandana", "123");

        System.out.println(supp.get());

        //  Predicate using Lambda
        Predicate<String> pred = t -> t.startsWith("C");

        System.out.println(pred.test("Chandana"));
    }
}


