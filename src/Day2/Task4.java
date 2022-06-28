package Day2;

/*

4) Ask user to input a whole number and output false, if it is even number and true if it is odd number.

 */

import java.util.Scanner;

public class Task4 {

    //MAIN

    public static void main(String[] args) {

        int n1;  //input variables

        //SCANNER

        Scanner sc = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Please enter whole number:"); //asking user for first number
        n1 = sc.nextInt();


        //METHOD TO CALCULATE IF NUMBER IS ODD OR EVEN

        if (n1 % 2 == 0) {
            System.out.println(false);; //number is even
        } else {
            System.out.println(true); //number is odd
        }
    }
}
