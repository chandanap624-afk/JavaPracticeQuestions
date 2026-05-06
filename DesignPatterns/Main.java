package com.wipro.Java.DesignPatterns;

//Singleton Design pattern//

public class Main {
	static DbConnection obj;

	public static void main(String[] args) {

		obj = DbConnection.getConnection();

	}

	void fetchUser()
	{
		// obj  // fetch users!
	}

}
