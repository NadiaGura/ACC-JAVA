package Day2;

/*

3) Ask user to input a whole number and output true, if it is even number and
false if it is odd number
Hint: use remainder operator to divide number by two and get reminder (if reminder is 0 then it means it is even number).

 */

import java.util.Scanner;

public class Task3 {

    //MAIN

    public static void main(String[] args) {

        int n1;  //input variables

        //SCANNER

        Scanner sc = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Please enter whole number:"); //asking user for first number
        n1 = sc.nextInt();


        //METHOD TO CALCULATE IF NUMBER IS ODD OR EVEN

        if (n1 % 2 == 0) {
            System.out.println(true);; //number is even
        } else {
            System.out.println(false); //number is odd
        }
    }
}
