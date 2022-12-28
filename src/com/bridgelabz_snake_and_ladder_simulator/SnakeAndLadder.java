package com.bridgelabz_snake_and_ladder_simulator;

public class SnakeAndLadder {

    public static final int NO_PLAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;
    public static final int START_POSITION = 0;
    public static final int WIN = 100;

    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Simulator....!");

        int playerPosition = 0;
        int dicePlayed = 0;
        System.out.println("Starting Position is ::" + START_POSITION);

        while (playerPosition < WIN) {
            dicePlayed++;

            int ROLL_DICE = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            System.out.println("After Rolling Dice We Get ::" + ROLL_DICE);
            int playerCheckOption = (int) (Math.random() * 3) + 1;

            switch (playerCheckOption) {
                case NO_PLAY:
                    System.out.println("It's No Play, Your position is not changed, You are at :" + playerPosition);
                    break;

                case LADDER:
                    if ((playerPosition + ROLL_DICE) <= WIN) {
                        playerPosition = playerPosition + ROLL_DICE;
                        System.out.println("Congratulations !! You Got the ladder your position will be increesed by " + ROLL_DICE);
                    }
                    break;

                case SNAKE:
                    if ((playerPosition - ROLL_DICE) < START_POSITION) {
                        playerPosition = START_POSITION;
                    } else {
                        playerPosition = playerPosition - ROLL_DICE;
                        System.out.println("Oops !! You just got bitten by snake your position will be decreased by " + ROLL_DICE);
                    }
                    break;

                default:
                    System.out.println("Something went wrong!!");
            }
            System.out.println("Position :: " + playerPosition);
        }
    }
}
