package com.bridgelabz_snake_and_ladder_simulator;

public class SnakeAndLadder {
    public static final int START_POSITION = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Simulator....!");

        System.out.println("Starting Position is ::" + START_POSITION);

        int ROLL_DICE = (int) (Math.floor(Math.random() * 10) % 6) + 1;
        System.out.println("After Rolling Dice We Get ::" + ROLL_DICE);
    }
}
