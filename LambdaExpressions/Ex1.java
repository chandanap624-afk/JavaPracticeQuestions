package com.wipro.Java.LambdaExpressions;

public class Ex1 {
	public static void main(String[] args) {
		
		
		Shape square= (x) ->  System.out.println("area of square:"+(x*x));
			
				square.area(4);
				
			}
			
		}



		interface Shape
		{
			void area(int x);
		}


