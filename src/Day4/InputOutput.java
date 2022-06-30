package Day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.sql.SQLOutput;

public class InputOutput {
    //Tasks from w3resources.com

    //MAIN
    public static void main(String[] args) throws IOException {

        //JAVA INPUT-OUTPUT EXERCISES

        //Task1. Get a list of a file/directory name from the given.
        File file = new File("/home/abc/something.txt"); //creating File object

        //Task2. Get specific files by extensions from a specified folder.

        //Task3. Write a program to check if a file or directory specified by pathname exists or not.
        if (file.exists()) {
            System.out.println("File/Directory exists.");
        } else {
            System.out.println("File/Directory does not exist.");
        }

            //Task4. Write a program to check if a file or directory has read and write permission.

            //check for read permission canRead()
            if (file.canRead()) {
                System.out.println("File/Directory has a read permission");
            } else {
                System.out.println("File has NO read permission.");
            }

            //check for write permission canWrite()
            if (file.canWrite()) {
                System.out.println("File/Directory has a write permission");
            } else {
                System.out.println("File has NO write permission.");
            }

            //Task5. Write program to check if given pathname is a Directory or a File.

        //check if Directory
        if(file.isDirectory()){
            System.out.println("Given pathname is a Directory.");
        }else{
            System.out.println("Pathname is not a Directory.");
        }

        //check if File
        if(file.isFile()){
            System.out.println("Given pathname is a File.");
        }else{
            System.out.println("Pathname is not a File.");
        }

        //Task6. Compare two files lexicographically.

        String a = "I love coding";
        String b = "hAPPY CODING!";

        System.out.println(a.compareTo(b));

        //Task7. Get last modified time of a file.

        //create Date object
        Date date = new Date(file.lastModified());

        System.out.println(date);

        //Task8. Read input from Java console.

        //create BufferReader object
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please print a word:");

        String word = BR.readLine();
        System.out.println("You inputted: " + word);

        //Task9. Get file size in bytes. kb, mb.

//       private static  String fileBytes(File file){
//           return file.length();
//        }
//        private static  String fileKb(File file){
//           return(double) file.length()/1024;
//        }

        //Task10. Read contents from a file into byte array.

        //Task11. Read a file content line by line.


        //Task12. Write a program to read a plain text file.

        //Task13. Write a program to read a file line by line and store it into variable.

        //Task14. Write a program to store text file content line by line into an Array.

        //Task15. Write a program to write and read a plain text file.

        //Task16. Write a program to append text to an existing file.

        //Task17. Write a program to read first 3 lines from a file.

        //Task18. Write a program to find the longest word in a text file.



        }
    }
