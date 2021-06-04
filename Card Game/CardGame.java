/**
 * Task: CPSC 1150 - Assignment 2
 * Program: Card Game
 * Description: Generates a random number from 1-52, then chooses which card (from a deck of cards) that number represents; prints to the console.
 * Author: Cordell Bonnieux
 * Date: June 4th 2021
 */
public class CardGame {
    public static void main(String[] args){
        //Print the first part of the statement to the console
        System.out.print("The card that has been picked is ");
        
        //Generate a random number between 1 - 52
        int card = 1 + (int)(Math.random() * 52);

        //Get rid of potential zeros
        if (card == 0)
            card++;
        
        //Decide what card number is represented by the random integer
        if (card == 1 || card == 14 || card == 27 || card == 40)
            System.out.print("Ace");
        else if (card == 2 || card == 15 || card == 28 || card == 41)
            System.out.print("2");  
        else if (card == 3 || card == 16 || card == 29 || card == 42)
            System.out.print("3");
        else if (card == 4 || card == 17 || card == 30 || card == 43)
            System.out.print("4");
        else if (card == 5 || card == 18 || card == 31 || card == 44)
            System.out.print("5");
        else if (card == 6 || card == 19 || card == 32 || card == 45)
            System.out.print("6");
        else if (card == 7 || card == 20 || card == 33 || card == 46)
            System.out.print("7");
        else if  (card == 8 || card == 21 || card == 34 || card == 47)
            System.out.print("8");
        else if (card == 9 || card == 22 || card == 35 || card == 48)
            System.out.print("9");
        else if (card == 10 || card == 23 || card == 36 || card == 49)
            System.out.print("10");
        else if (card == 11 || card == 24 || card == 37 || card == 50)
            System.out.print("Jack");
        else if (card == 12 || card == 25 || card == 38 || card == 51)
            System.out.print("Queen");
        else if (card == 13 || card == 26 || card == 39 || card == 52)
            System.out.print("King");

        //Pick the suit of the card, and display to console
        switch (card % 4) {
            case 0 :
                System.out.println(" of Clubs.");
                break;
            case 1 :
                System.out.println(" of Diamonds.");
                break;
            case 2 :
                System.out.println(" of Hearts.");
                break;
            case 3 :
                System.out.println(" of Spades.");
                break;
        }
    }
}