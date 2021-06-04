/**
 * Task: CPSC 1150 - Assignment 2
 * Program: Guessing Game
 * Description: 
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
            System.out.print("Horay you win!");

        else {

        }
    }
}