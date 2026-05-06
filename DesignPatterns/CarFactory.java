package com.wipro.Java.DesignPatterns;


public class CarFactory {

	public static  Car  createCar(String type)
	{
		if(type.equalsIgnoreCase("bmw"))
		{
			return new Bmw();
		}
		else if (type.equalsIgnoreCase("audi"))
				{
			return new Audi();
				}
		else return null;
	}
}
