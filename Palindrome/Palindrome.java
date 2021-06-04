/**
 * Task: CPSC 1150 - Assignment 2
 * Program: Plaindome
 * Description: Generates 3 random integers, glues them together, 
 * determines whether or not it is a palindrome, then prints out the results.
 * Author: Cordell Bonnieux
 * Date: June 4th 2021
 */
public class Palindrome {
    public static void main (String[] arg) {

        //Generate first integer - first integer cannot be zero
        int num1 = (int)(1 + Math.random() * 10);
        
        //first integer cannot be 10
        if (num1 == 10)
            num1--;

        //Generate third number
        int num3 = (int)(0 + Math.random() * 10);

        //Bool for checking if the number is a palindrome
        boolean palindrome = false;

        //Do the first and third digits match?
        if (num1 == num3)
            palindrome = true;
        
        //Generate second number 
        int num2 = (int)(0 + Math.random() * 10);

        //Print the results to the console
        System.out.println(num1 + "" + num2 + "" + num3 + (palindrome ? " is a palindrome." : " is not a palindrome"));
        
    }
}