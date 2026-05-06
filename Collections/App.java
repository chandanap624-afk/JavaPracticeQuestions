package com.wipro.Java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;   // step1

import com.sun.tools.javac.Main;



public class App extends Main
{
    public static void main( String args[] )
    {
    	
      Student s1=new Student("sakshi",12);
      Student s2=new Student("ram",22);
      Student s3=new Student("neha",13);
      Student s4=new Student("Sneha",14);
      
      List<Student> list=new ArrayList<Student>();
      list.add(s1);
      list.add(s2);
      list.add(s3);
      list.add(s4);
      
      Collections.sort(list);
      System.out.println(list);
    }


}
