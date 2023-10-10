package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the score game: ");
        String score = scanner.next();

        String[] parts = score.split("\\|");
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        if (homeScore > visitorScore) {
            System.out.println(teams[0] + " had the higher score with " + homeScore + " points.");
        } else if (visitorScore > homeScore) {
            System.out.println(teams[1] + " had the higher score with " + visitorScore + " points.");
        } else {
            System.out.println("Both teams scored the same with " + homeScore + " points.");
        }
    }
}

