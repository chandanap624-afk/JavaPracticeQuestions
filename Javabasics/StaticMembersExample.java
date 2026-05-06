package com.wipro.Java.Javabasics;

public class StaticMembersExample {
public static void main(String[] args) {
		
		Student1 obj=new Student1("sakshi","123"); //50 students
		obj.updateCollege();// UPDATING COLLEGE TO ABC
		obj.display();
	
		Student1.show();
	
		
		
		Student1 obj1=new Student1(" neha","126"); //50 students
		obj1.display();
	}
	
	
}

class Student1
{
	static void show()
	{
		System.out.println("class static method is working");
	}
	
	
	
	 String name,rollno; //50 students  // non static variable  or instance variable
	static String college="xyz";   // 1 copy
	
	public Student1(String name, String rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	
	void updateCollege()
	{
		college="ABC";
	}

	 void display()
	{
		System.out.println(name+" "+rollno+" "+college);
	}
}




