package com.example.project;

import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer {
        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int distanceTraveled;
        private int runTimeLeft;
        private int restTimeLeft;
        private boolean isRunning;

        // Constructor
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            this.distanceTraveled = 0;
            this.runTimeLeft = runDuration;
            this.restTimeLeft = 0;
            this.isRunning = true;
        }

        // Getter for distance traveled
        public int getDistanceTraveled() {
            return distanceTraveled;
        }

        // Simulates a single second of running/resting
        public void simulateSecond() {
            if (isRunning) {
                distanceTraveled += speed;
                runTimeLeft--;
                if (runTimeLeft == 0) {
                    isRunning = false;
                    restTimeLeft = restDuration;
                }
            } else {
                restTimeLeft--;
                if (restTimeLeft == 0) {
                    isRunning = true;
                    runTimeLeft = runDuration;
                }
            }
        }

        public String getName() {
            return name;
        }
    }

    public static String simulateRace(int time, Reindeer[] reindeers) {
        for (int t = 0; t < time; t++) {
            for (Reindeer reindeer : reindeers) {
                reindeer.simulateSecond();
            }
        }

        // Find the reindeer that traveled the farthest
        Reindeer winner = reindeers[0];
        for (Reindeer reindeer : reindeers) {
            if (reindeer.getDistanceTraveled() > winner.getDistanceTraveled()) {
                winner = reindeer;
            }
        }

        return winner.getName();
    }

    public static void main(String[] args) {
        
    }
}
