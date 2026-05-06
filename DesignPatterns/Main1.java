package com.wipro.Java.DesignPatterns;

/*interface Subsriber
class Investors1  multiple investors
class StockMarket - it notify the all available investors for any change*/

//Using Observer Design Pattern//

import java.util.*;

//Main class (only public class)
public class Main1 {

 // 1. Subscriber Interface
 interface Subscriber {
     void update(String stockName, double price);
 }

 // 2. Concrete Subscribers
 static class Investor1 implements Subscriber {
     public void update(String stockName, double price) {
         System.out.println("Investor1 notified: " + stockName + " price is " + price);
     }
 }

 static class Investor2 implements Subscriber {
     public void update(String stockName, double price) {
         System.out.println("Investor2 notified: " + stockName + " price is " + price);
     }
 }

 // 3. Subject (StockMarket)
 static class StockMarket {
     private List<Subscriber> subscribers = new ArrayList<>();

     public void addSubscriber(Subscriber s) {
         subscribers.add(s);
     }

     public void notifySubscribers(String stockName, double price) {
         for (Subscriber s : subscribers) {
             s.update(stockName, price);
         }
     }

     public void setStockPrice(String stockName, double price) {
         System.out.println("\nStock Updated: " + stockName + " -> " + price);
         notifySubscribers(stockName, price);
     }
 }

 // 4. Main method
 public static void main(String[] args) {

     StockMarket market = new StockMarket();

     Subscriber inv1 = new Investor1();
     Subscriber inv2 = new Investor2();

     market.addSubscriber(inv1);
     market.addSubscriber(inv2);

     market.setStockPrice("TCS", 3500.50);
     market.setStockPrice("INFY", 1500.75);
 }
}