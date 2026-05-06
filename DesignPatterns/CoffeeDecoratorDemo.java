package com.wipro.Java.DesignPatterns;

public class CoffeeDecoratorDemo {

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();

        coffee = new Milk(coffee);      // add milk
        coffee = new Sugar(coffee);     // add sugar

        System.out.println(coffee.getDescription());
        System.out.println(coffee.cost());
    }
}

// 1. Coffee Interface
interface Coffee {
    String getDescription();
    int cost();
}

// 2. Basic Coffee
class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }

    public int cost() {
        return 50;
    }
}

// 3. Abstract Decorator
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

// 4. Milk Decorator
class Milk extends CoffeeDecorator {

    Milk(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public int cost() {
        return coffee.cost() + 20;
    }
}

// 5. Sugar Decorator
class Sugar extends CoffeeDecorator {

    Sugar(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    public int cost() {
        return coffee.cost() + 10;
    }
}