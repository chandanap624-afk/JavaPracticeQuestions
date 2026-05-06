package com.wipro.Java.Collections.Exercise.Programs;

//Shopping Cart//
//Add, remove, and display items in a user’s shopping cart. Allow duplicate items.//

import java.util.ArrayList;

public class ShoppingCart {

    public static void main(String[] args) {

        ArrayList<String> cart = new ArrayList<>();

        // Add items
        cart.add("Apple");
        cart.add("Banana");
        cart.add("Apple"); // duplicate allowed
        cart.add("Milk");

        // Display cart
        System.out.println("Cart Items: " + cart);

        // Remove item
        cart.remove("Apple"); // removes first occurrence

        // Display after removal
        System.out.println("After removing Apple: " + cart);
    }
}