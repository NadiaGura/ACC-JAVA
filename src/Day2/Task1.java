package Day2;

/*

1) Ask user to input two numbers, compare them and output result:
   Input:
       Enter value a: 10
       Enter value b: 10
   Expected output:
       is 10 equal to 10? - true
       is 10 less than 10? - false
       is 10 less or equal to 10? - true
       is 10 greater than 10? - false
       is 10 greater or equal to 10? - true

 */

import java.util.Scanner;

public class Task1 {

    //MAIN

    public static void main(String[] args) {


        Double num1;  //input variables
        Double num2;

        //SCANNER
        Scanner sc = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Please enter first number"); //asking user for number input
        num1 = sc.nextDouble();

        System.out.println("Please enter second number");//asking user for second number input
        num2 = sc.nextDouble();

        //METHOD TO COMPARE VALUES AND PRINT RESULT

        //is 10 equal to 10? - true
        if (num1 == num2) {
            System.out.println(" is " + num1 + " equal to " + num2 + " ? - true");
        } else {
            System.out.println(" is " + num1 + " equal to " + num2 + " ? - false");
        }

        //is 10 less than 10? - false
        if (num1 < num2) {
            System.out.println(" is " + num1 + " less than " + num2 + " ? - true");
        } else {
            System.out.println(" is " + num1 + " less than " + num2 + " ? - false");
        }

        //is 10 less or equal to 10? - true
        if (num1 <= num2) {
            System.out.println(" is " + num1 + " less or equal to " + num2 + " ? - true");
        } else {
            System.out.println(" is " + num1 + " less or equal to " + num2 + " ? - false");
        }

        //is 10 greater than 10? - false
        if (num1 > num2) {
            System.out.println(" is " + num1 + " greater than " + num2 + " ? - true");
        } else {
            System.out.println(" is " + num1 + " greater than " + num2 + " ? - false");
        }

        //is 10 greater or equal to 10? - true
        if (num1 >= num2) {
            System.out.println(" is " + num1 + " greater or equal to " + num2 + " ? - true");
        } else {
            System.out.println(" is " + num1 + " greater or equal to " + num2 + " ? - false");
        }
    }
}

