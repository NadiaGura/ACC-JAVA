package Day4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    //MAIN
    public static void main(String[] args) {

        //ARRAY_LIST
        //Task1. Create a new ArrayList, add some colors(String), print out the collection.

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("brown");
        colors.add("blue");

        System.out.println(colors);

        //Task22.Print all the elements of an ArrayList using the position of the element.
        for(int i = 0; i< colors.size();i++) //iterate through the ArrayList to print each element in the consequence of its index
        System.out.println(colors.get(i));


        //LINKED_LIST
        //Task1. Append the specified element to the end of the LinkedList.
        LinkedList<String> fruits = new LinkedList<String>();
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple"); // elements always added as last element

        System.out.println(fruits);

        //Task26. Replace and element in a LinkedList.
        fruits.set(0,"pear");
        System.out.println(fruits);

        //HASH_SET
        //Task1. Append a specified element to the end of a hash set.

        //Task.
    }
}