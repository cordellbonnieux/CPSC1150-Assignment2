/**
 * Task: CPSC 1150 - Assignment 2
 * Program: Guessing Game
 * Description: This program generates a random number from 1 - 10, the user then tries to guess that number.
 * Author: Cordell Bonnieux
 * Date: June 4th 2021
 */
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args){
        
        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Generate a random integer between 1 and 10
        int num = 1 + (int)(Math.random() * 10);

        //Prompt the user to make a guess
        System.out.print("What is your guess? ");

        //Read user input
        int guess = input.nextInt();

        //Check to see if input is valid
        if (guess > 10 || guess < 1) {

            //If the input is invalid, bid the user farewell
            System.out.println("Well if you're not going to \"try\" I'm not playing.");
            System.exit(0);

        }
        
        //Check to see if the input matches the random number
        if (guess == num)

            //If it matches, the user wins
            System.out.println("Horay you win!");

        else {

            //If not the user looses, and the number is written to console
            System.out.println("The number was " + num + ".");

            if (guess == num - 1 || guess == num - 2 || guess == num - 3 || guess == num + 1 || guess == num + 2 || guess == num + 3)

                //The user got close
                System.out.println("It was close");

            else

                //The user's guess was way off
                System.out.println("You missed it by miles");
            
            //Give the user some positive reinforcement
            System.out.println("Better luck next time");

        }
    }
}