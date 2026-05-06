package com.wipro.Java.Collections.Exercise.Programs;

import java.util.ArrayList;

public class MovieWatchList {

    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>();

        // Add movies
        movies.add("RRR");
        movies.add("Bahubali");
        movies.add("Inception");
        movies.add("KGF");
        movies.add("Bahubali"); // duplicate allowed

        // Display all movies
        System.out.println("Movie List: " + movies);

        // Search movie
        String search = "KGF";
        boolean found = false;

        for (String m : movies) {
            if (m.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " is available in watchlist");
        } else {
            System.out.println(search + " not found");
        }
    }
}
