package com.wipro.Java.DesignPatterns;
//Singleton Design Pattern//

public class DbConnection {

	
	static DbConnection obj;
	
	
	public static   DbConnection  getConnection()
	{
		if(obj==null)
		{
			obj=new DbConnection(); // new object initialization
		}
		
		
		return obj; //existing object
	}
	
	
}
