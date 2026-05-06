package com.wipro.Java.DesignPatterns;
import java.util.*;


public class ObserverWeatherEx {

	public static void main(String[] args) {

	        WeatherStation station = new WeatherStation();

	        Observer mobile = new MobileDisplay();
	        Observer website = new WebsiteDisplay();
	        Observer led = new LEDDisplay();

	        station.addObserver(mobile);
	        station.addObserver(website);
	        station.addObserver(led);

	        station.setTemperature(30);
	        station.setTemperature(35);
	    }
	}

	// 1. Observer Interface
	interface Observer {
	    void update(int temperature);
	}

	// 2. Concrete Observers

	class MobileDisplay implements Observer {
	    public void update(int temperature) {
	        System.out.println("Mobile Display: Temperature = " + temperature);
	    }
	}

	class WebsiteDisplay implements Observer {
	    public void update(int temperature) {
	        System.out.println("Website Display: Temperature = " + temperature);
	    }
	}

	class LEDDisplay implements Observer {
	    public void update(int temperature) {
	        System.out.println("LED Display: Temperature = " + temperature);
	    }
	}

	// 3. Subject (Weather Station)
	class WeatherStation {

	    private List<Observer> observers = new ArrayList<>();
	    private int temperature;

	    public void addObserver(Observer o) {
	        observers.add(o);
	    }

	    public void removeObserver(Observer o) {
	        observers.remove(o);
	    }

	    public void notifyObservers() {
	        for (Observer o : observers) {
	            o.update(temperature);
	        }
	    }

	    public void setTemperature(int temperature) {
	        System.out.println("\nTemperature updated to: " + temperature);
	        this.temperature = temperature;
	        notifyObservers();
	    }
	}
