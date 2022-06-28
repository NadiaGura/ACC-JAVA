package Day2;

/*

6) Write a program which asks the user to input two whole numbers a and b. Output "true", if one of this condition is true:
    1) a and b is equal
    2) a is less than 0 and b is greater than 0
    3) both of them are greater than 100

    otherwise output "false".

    Examples:
        a is -1 and b is -2 -> false
        a is -2 and b is 1 -> true
        a is -1 and b is -1 -> true
        a is 101 and b is 102 -> true
        a is 99 and b is 200 -> false

 */

import java.util.Scanner;

public class Task6 {
    //MAIN

    public static void main(String[] args) {

        int n1;  //input variables
        int n2;

        //SCANNER

        Scanner sc = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Please enter first number:"); //asking user for first number
        n1 = sc.nextInt();
        System.out.println("Please enter second number:"); //asking user for first number
        n2 = sc.nextInt();


        //METHOD TO CALCULATE IF NUMBER IS ODD OR EVEN

//        if (n1 > 100 & n2 > 100) {
//            System.out.println(true);
        } else {
            if (n1 == n2 || n1 > 0 || n2 > 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
//}
