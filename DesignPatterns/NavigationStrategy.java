package com.wipro.Java.DesignPatterns;

//Strategy design pattern Example

public class NavigationStrategy {

    public static void main(String[] args) {

        NavigationContext context = new NavigationContext();

        // Fastest Route
        context.setStrategy(new FastestRoute());
        context.buildRoute("Home", "Office");

        // Shortest Route
        context.setStrategy(new ShortestRoute());
        context.buildRoute("Home", "Office");

        // Avoid Tolls
        context.setStrategy(new AvoidTollRoute());
        context.buildRoute("Home", "Office");
    }
}

// 1. Strategy Interface
interface RouteStrategy {
    void buildRoute(String source, String destination);
}

// 2. Concrete Strategies

class FastestRoute implements RouteStrategy {
    public void buildRoute(String source, String destination) {
        System.out.println("Fastest route from " + source + " to " + destination);
    }
}

class ShortestRoute implements RouteStrategy {
    public void buildRoute(String source, String destination) {
        System.out.println("Shortest route from " + source + " to " + destination);
    }
}

class AvoidTollRoute implements RouteStrategy {
    public void buildRoute(String source, String destination) {
        System.out.println("Route avoiding tolls from " + source + " to " + destination);
    }
}

// 3. Context Class
class NavigationContext {

    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute(String source, String destination) {
        if (strategy == null) {
            System.out.println("Please select a route strategy");
            return;
        }
        strategy.buildRoute(source, destination);
    }
}
