package com.wipro.Java.Javabasics;

class Student {

	    int rollNo;
	    String name;
	    
	    // static variable
	    static String Training_Center
	        = "GFG"; 

	    Student(int r, String n){
	        
	        rollNo = r;
	        name = n;
	    }

	    void display(){
	        
	        System.out.println(rollNo + " " + name + " "
	                           + Training_Center);
	    }
	}

	public class Student{
	    
	    public static void main(String[] args){
	        
	        StaticVariableExample s1 = new StaticVariableExample(101, "Ravi");
	        StaticVariableExample s2 = new StaticVariableExample(102, "Amit");

	        s1.display();
	        s2.display();
	    }
	}


