package Day2;

/*

5) Write a program which reads boolean value from user and prints out the opposite value:
    Example input:
        Enter boolean value: true
    Expected output:
        Opposite of "true" is "false"

 */

import java.util.Scanner;

public class Task5 {

    //MAIN

    public static void main(String[] args) {

        boolean b1;  //input variables

        //SCANNER

        Scanner sc = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Please enter boolean value in format -  true/false"); //asking user for boolean value input
        b1 = sc.nextBoolean();


        //METHOD TO COMPARE VALUES AND PRINT OUTPUT

        if (b1 == true) {
            System.out.println("Opposite of " + b1 + " is " + false);
        } else {
            System.out.println("Opposite of " + b1 + " is " + true);
        }
    }
}
