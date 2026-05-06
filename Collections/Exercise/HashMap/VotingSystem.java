package com.wipro.Java.Collections.Exercise.HashMap;

//Voting System
//Count votes for each candidate and find the winner.


import java.util.HashMap;

public class VotingSystem {

    public static void main(String[] args) {

        HashMap<String, Integer> votes = new HashMap<>();

        // Simulated votes
        String[] voters = {
            "siri", "chandu", "siri", "rakshi",
            "vani", "pravalli", "siri", "chandu",
            "vani", "siri"
        };

        // Count votes
        for (String candidate : voters) {

            if (votes.containsKey(candidate)) {
                votes.put(candidate, votes.get(candidate) + 1);
            } else {
                votes.put(candidate, 1);
            }
        }

        System.out.println("Vote Count: " + votes);

        // Find winner
        String winner = "";
        int maxVotes = 0;

        for (String candidate : votes.keySet()) {
            int count = votes.get(candidate);

            if (count > maxVotes) {
                maxVotes = count;
                winner = candidate;
            }
        }

        System.out.println("Winner: " + winner + " with " + maxVotes + " votes");
    }
}
