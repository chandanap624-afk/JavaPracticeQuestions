package com.wipro.Java.Collections.Exercise.Programs;

//Recent Searches (Browser)
//Store last N search queries and display them in order.
import java.util.ArrayList;

public class RecentSearches {

    public static void main(String[] args) {

        int N = 5;
        ArrayList<String> searches = new ArrayList<>();

        // Adding searches
        addSearch(searches, "Google", N);
        addSearch(searches, "YouTube", N);
        addSearch(searches, "Amazon", N);
        addSearch(searches, "ChatGPT", N);
        addSearch(searches, "Instagram", N);

        System.out.println("Searches: " + searches);

        // Add one more (exceeds limit)
        addSearch(searches, "Twitter", N);

        System.out.println("After adding new search: " + searches);
    }

    // Method to maintain only last N searches
    public static void addSearch(ArrayList<String> list, String query, int limit) {

        if (list.size() == limit) {
            list.remove(0); // remove oldest
        }

        list.add(query); // add new search
    }
}

