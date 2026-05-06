package com.wipro.Java.LambdaExpressions;

public class Ex2 {
	public static void main(String[] args) {
		
		
		Shape1 rectangle= (x,y) ->
		                 {  System.out.println("area of rectangle:"+(x*y));
		                       System.out.println("Thankyou!");
		                        };
			
				rectangle.area(4,5);
				
			}
			
		}


		interface Shape1
		{
			void area(int x,int y);
		}
		
		
