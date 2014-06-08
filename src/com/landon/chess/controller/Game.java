package com.landon.chess.controller;

import java.util.Scanner;

public class Game {
    private static Scanner userInput;
    private static int gameState;
    private static boolean playAgain;

    private static final int STATE_END_GAME = -1;
    private static final int STATE_START_NEW_GAME = 0;
    private static final int STATE_BEGIN_TURN = 1;
    private static final int STATE_PICK_PIECE = 2;
    private static final int STATE_PICK_DESTINATION = 3;
    private static final int STATE_END_TURN = 4;

    private static final boolean DEBUG = true;

    public static void main(String[] args) {
        userInput = new Scanner(System.in);

        introduction();

        while (playAgain) {
            if (DEBUG) log("Beginning of the loop.");

            if (gameState == STATE_END_GAME) {
                if (DEBUG) log("gameState == END_GAME");

                System.out.println("Game Over.");
                System.out.println("Would you like to play again? [Y/n]");

                if (userInput.next().equals("Y")) {
                    gameState = STATE_START_NEW_GAME;
                } else {
                    break;
                }
            }

            if (gameState == STATE_START_NEW_GAME) {
                if (DEBUG) log("gameState == START_NEW_GAME");

                Board gameBoard = new Board();
                gameBoard.printBoard();

                break;
            }

            if (gameState == STATE_BEGIN_TURN) {
                if (DEBUG) log("gameState == BEGIN_TURN");
            }

            if (gameState == STATE_PICK_PIECE) {
                if (DEBUG) log("gameState == PICK_PIECE");
            }

            if (gameState == STATE_PICK_DESTINATION) {
                if (DEBUG) log("gameState == PICK_DESTINATION");
            }

            if (gameState == STATE_END_TURN) {
                if (DEBUG) log("gameState == END_TURN");
            }
        }

        System.out.println("Thanks for playing!");
        userInput.close();
        System.exit(0);
    }

    private static void introduction()   {
        System.out.println("This is a Chess game in a command line environment.");
        System.out.println("Would you like to play? [Y/n]");

        playAgain = userInput.next().equals("Y");
        if (playAgain) gameState = STATE_START_NEW_GAME;
    }
    // TODO: maybe move this to Util package?
    private static void log(String msg) {
        System.out.println("DEBUG MSG: " + msg);
    }
}
