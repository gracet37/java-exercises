package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        String brand;
        int numOfPicks;
        boolean rockStarUsesIt;
    }

    void setBrand(String abrand) {
        brand = abrand;
    }

    String getBrand() {
        return brand;
    }

    void setNumOfPicks(int num) {
        numOfPicks = num;
    }

    int getNumOfPicks() {
        return numOfPicks;
    }

    public static void displayHighScorePosition(int position, String name) {
        System.out.println(name + " " + "managed to get into position" + " " + position);
    }

    public static void calculateHighScore(int score) {
        String name = "George";
        if (score > 1000) {
            displayHighScorePosition(score, name);
        } else if (score > 500 && score < 1000) {
            displayHighScorePosition(score, name);
        } else if (score > 100 && score < 500) {
            displayHighScorePosition(score, name);
        } else {
            System.out.println("Bleh");
        }
    }

    static void bark() {
        System.out.println("Woof");
    }
}
