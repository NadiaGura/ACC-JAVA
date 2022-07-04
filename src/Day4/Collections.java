package Day4;

import java.util.*;
//w3resource.com Tasks

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

        //Task2. Iterate through all elements in an array List.
        for(String elements: colors){
            System.out.println(colors);
        }

        //Task3. Insert an element into the array List at the first position.
        colors.add(0,"navy");

        //Task4. Retrieve an element(at specific index) from an AArray list.
        colors.get(2);

        //Task5. Update specific array element by given element.
        colors.set(0,"gold");

        //Task6. Remove third element from an Array List.
        colors.remove(2);

        //Task7. Search an element in an Array List.
        if(colors.contains("gold")){
            System.out.println("gold");
        }else{
            System.out.println("Element not found.");
        }

        //Task8. Sort a given Array List.
        // CORRECT Collections.sort(colors);

        //Task9. Copy one Array List to another.


        //Task10. Shuffle elements in an Array List.

        //Task11. Reverse elements in an Array List.

        //Task12. Extract a portion of an Array List.

        //Task13. Compare two Array Lists.

        //Task14. Swap two elements in an Array List.

        //Task15. Join two Array Lists.

        //Task16. Clone one Array list to another.

        //Task17. Empty an Array List.

        //Task18. Test if an Array List is empty or not.

        //Task19. Trim the capacity of an Array List the current list size.

        //Task20. Increase the size of an Array List.

        //Task21. Replace the second element of an Array List with the specified element.

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
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(15);
        hashSet.add(99);

        System.out.println(hashSet);

        //Task12. Remove all of the elements form a HashSet.

        hashSet.clear(); //remove all elements
        System.out.println(hashSet);

        //TREE_SET
        //Task1. Create a new Tree Set, add some colors(String) and print our Tree Set.
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("brown");
        treeSet.add("blue");
        treeSet.add("green");
        treeSet.add("pink");
        treeSet.add("yellow");

        System.out.println(treeSet);

        //Task16. Remove a given element from a Tree Set.
        treeSet.remove("brown");

        //PRIORITY_QUEUE
        //Task1. Create a new prioroty queue, add colors(String) and print out elements.
        PriorityQueue<String>priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("white");
        priorityQueue.add("purple");
        priorityQueue.add("orange");
        priorityQueue.add("gray");

        System.out.println(priorityQueue);

        //Task12. Change Priority Queue to maximum priorityQueue.

//        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(5,Collections.reverseOrder());
//        queue.add(1);
//        queue.add(10);
//        queue.add(45);
//        queue.add(2);
//        queue.add(5);
//        System.out.println(queue);
//
//        Integer val = null;
//        while(val = queue.poll()) != null){
//            System.out.println(val +" ");
//        }
//        System.out.println("\n");

        //HASH_MAP
        //Task1. Associate the specified value with the specified key in a HashMap.
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"James");
        hashMap.put(2,"Bill");
        hashMap.put(3,"Sam");
        hashMap.put(4,"Mike");

        for(Map.Entry x:hashMap.entrySet()){
            System.out.println(x.getKey()+ " "+ x.getValue());
        }

        //Task12. Get a Collection view of the values contained in this map.
        System.out.println(hashMap.values());

        //TREE_MAP
        //Task1. Associate the specified value with the specified key in a TreeMap.
        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
        treeMap.put(1,"orange");
        treeMap.put(2,"banana");
        treeMap.put(3,"strawberry");
        treeMap.put(4,"lemon");

        for(Map.Entry<Integer,String> entry: treeMap.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

        //Task26. Get the last key greater than or equal to the given key.Returns null if there is no such key.
        System.out.println(treeMap.ceilingKey(1));
        System.out.println(treeMap.ceilingKey(2));
        System.out.println(treeMap.ceilingKey(3));
        System.out.println(treeMap.ceilingKey(4));
    }
}