package com.cipherbytetech;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNum {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        
        boolean playAgain = true;

        while (playAgain) {
            int systemGeneratedNum = ran.nextInt(10) + 1;
            int userGuessNum = 0;
            int numOfAttempts = 0;
            int score = 0;

            System.out.println("Computer Generated a Number Between 1 to 10, Guess and Enter the Number:");

            while (userGuessNum != systemGeneratedNum) {
                userGuessNum = sc.nextInt();
                numOfAttempts++;
                
                if (userGuessNum == systemGeneratedNum) {
                    score = 10 - numOfAttempts;
                    System.out.println("Congratulations! Your Guess is Correct in " + numOfAttempts + " Attempts");
                    System.out.println("Your Score is: " + score);
                } else {
                    System.err.println("Your Guess is Wrong..! Please try again later");
                    if (numOfAttempts == 10) {
                        System.out.println("Sorry..You have only 10 attempts..!");
                        break;
                    }
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = sc.next();
            playAgain = playChoice.equalsIgnoreCase("yes");
        }

        sc.close();
        System.out.println("Thank you for playing the Guess the Number game!");
    }
    
}
