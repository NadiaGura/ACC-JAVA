package Day2;

import java.util.Scanner;

/*

2) Ask user to input two boolean values and compare them.
    Input:
       Enter b1: true
       Enter b2: false

    Expected output:
       Is b1 and b2 equal? - false

 */
public class Task2 {

    //MAIN

    public static void main(String[] args) {

        boolean b1;  //input variables
        boolean b2;

        //SCANNER

        Scanner sc = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Please enter first boolean value for comparison in format -  true/false"); //asking user for boolean value input
        b1 = sc.nextBoolean();

        System.out.println("Please enter second boolean value true/false");//asking user for second input
        b2 = sc.nextBoolean();

        //METHOD TO COMPARE VALUES AND PRINT RESULT
        if (b1 == b2) {
            System.out.println(" is " + b1 + " equal to " + b2 + " ? - true");
        } else {
            System.out.println(" is " + b1 + " equal to " + b2 + " ? - false");
        }
    }
}

