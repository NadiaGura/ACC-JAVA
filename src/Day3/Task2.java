package Day3;

/*

2) Declare and initialize an array with four arbitrary whole numbers.
 Write a Java program to copy this array by iterating it.


 */
public class Task2 {

    //MAIN

    public static void main(String[] args) {

        //declare and initialize array with 4 arbitrary whole numbers
        int[] array = {5, 9, 2, 7};

        //declare second array where to copy first array
        int[] secondArray = new int[array.length];

        //copy array to secondArray
        for (int i = 0; i < array.length; i++) {
            secondArray[i] = array[i];
        }


        //print arrays
        System.out.println("First Array");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println("\nCopy of the first Array");
        for (int i = 0; i < secondArray.length; i++)
            System.out.print(secondArray[i] + " ");

    }
}