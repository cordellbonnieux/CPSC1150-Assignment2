/**
 * Task: CPSC 1150 - Assignment 2
 * Program: Card Game
 * Description: Generates a number between 1 and 52, then using that number...
 * Author: Cordell Bonnieux
 * Date: June 4th 2021
 */
public class CardGame {
    public static void main(String[] args){
        //
        System.out.println("The card that has been picked is ");
        
        //Generate a random number between 1 - 52
        int random = 1 + (int)(Math.random() * 52);

        //Get rid of potential zeros
        if (random == 0)
            random++;
        
        Switch (random) {
            case (1 || 14 || 27 || 40) :
                System.out.print("Ace");
                break;
            case (2 || 15 || 28 || 41) :
                System.out.print("2");
                break;
            case (3 || 16 || 29 || 42) :
                System.out.print("3");
                break;
            case (4 || 17 || 30 || 43) :
                System.out.print("4");
                break;
            case (5 || 18 || 31 || 44) :
                System.out.print("5");
                break;
            case (6 || 19 || 32 || 45) :
                System.out.print("6");
                break;
            case (7 || 20 || 33 || 46) :
                System.out.print("7");
                break;
            case (8 || 21 || 34 || 47) :
                System.out.print("8");
                break;
            case (9 || 22 || 35 || 48) :
                System.out.print("9");
                break;
            case (10 || 23 || 36 || 49) :
                System.out.print("10");
                break;
            case (11 || 24 || 37 || 50) :
                System.out.print("Jack");
                break;
            case (12 || 25 || 38 || 51) :
                System.out.print("Queen");
                break;
            case (13 || 26 || 39 || 52) :
                System.out.print("King");
                break;
            default :
                System.out.println(" Cordell you made a mistake in the first switch!");
                break;
        }
        
        //Pick the suit of the card, and display to console
        switch (random % 4) {
            case 0 :
                System.out.print(" of Clubs.");
                break;
            case 1 :
                System.out.print(" of Diamonds.");
                break;
            case 2 :
                System.out.print(" of Hearts.");
                break;
            case 3 :
                System.out.print(" of Spades.");
                break;
            default :
                System.out.println(" you made a mistake in the second switch statement.");
                break;
        }
    }
}