package Prelim;/*
 Name: Karlo Rafael G. Dela Pena
 Date: 15-08-2024

Notes:
The one-dimensional array is a static linear data structure.  The one-dimensional array is an implementation of the List ADT. The one-dimensional array may be used to hold values/objects that are logically arranged in a linear fashion.  Populating the array(i.e. Putting elements in the array), sorting the elements of the array, searching an element from the array based on a key,  and displaying the elements of the array are some of the operations that may be performed on the list.

Objective.
Create a simple application that uses the one-dimensional array as a data Structure.   In order to have an exercise on creating implementations of operations,  a code/program for the method that implements each  operation  should be written rather than using predefined methods of the array (i.e. Do not use pre-defined methods for sorting and displaying elements that are predefined in Java).

Activity:
Create an executable class that applies a Sort Algorithm and a Search algorithm on an array of Strings (i.e. names)
done - In the code( e.g. in the main method), declare a one-dimensional array of String such that the array will be populated out of data that are read from a datafile(i.e. textfile).

done - The class should have a method that populates an array of String out of data that are read from a data file.  The formal parameters of the method is an array of String and a String that represents a filename.

done - The class should have a method that implements a sort Algorithm(e.g. Selection Sort Algorithm). The method for sorting should have a one-dimensional array of String as formal parameter.

done - The class should have a method that implements a search algorithm(e.g. Linear Search algorithm).  The method for searching should have a one-dimensional array of String and a search key of type String as formal parameters.

done - The class should have a method that displays the elements of a one-dimensional array.

done - Let the program show the elements of the array before the sorting happens

done - Let the program show the elements of the array after sorting

done - Let the computer accept a string to be searched from the array then let the computer specify whether the string is found in the array or not.

done - Show that sample output/run of the program through multiple line comments in the source file
( i.e. After running the programming, copy and paste the output within a comment section of the source code).



 Prelim.Main Algorithm:
(Sample only)
 1. Declare an array of String.
 2.  Populate the array of String using the method for populating the array with data that are read from a datafile.
 3. Display the elements of the array using the method for showing the elements of an array
 4. Sort the elements of the array using the method for sorting the elements of the array.
 5. Display the elements of the sorted array using the method for showing the elements of an array
 6. Display a prompt message for the user to enter a search key ( depending on your program design)
 7. Let the computer check if the item being searched is in the array and display an informative message regarding the result of the search.


Additional Notes:
Using the Java programming language, the norm for creating a program that is illustrative of dealing with Data Structures are as follows***:
1. Create a java interface as a way to specify an Abstract Data Type(ADT) or Create an Abstract Class as a way to an abstract data type
2. Create a concrete class that implements the interface as a way to have a code for the Data Structure (Recall: A Data Structure is based on an ADT).
3. Create an application ( an executable program, hence, a class with the main method) that uses the concrete class.

***For this Warm up exercise, however, you do not need to create an interface or an Abstract class.  Instead, create a concrete class with the main method and other relevant methods.  Below is the general form of the expected program.

Deliverable:
The source code (i.e. Upload the *.java in this Submission Bin)

 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DelaPenaProgrammingExercise1 {
    public static void main(String[] args) throws IOException {
        //declaring a one-dimensional array
        String[] namesArray = {"John","Luke","Keith","Adam","Kaleb"};
        //method to display elements within the array
        System.out.println("Array from main method: ");
        showElements(namesArray);
        System.out.println("---------------------------------------------");
        //method to populate an array with string elements from a text file
        String[] fileArray = fillArray("C:\\Users\\Karlo\\Documents\\PC\\AREAS\\SLU\\CS211\\listOfNames.txt");
        System.out.println("Array from text file: ");
        showElements(fileArray);
        System.out.println("---------------------------------------------");
        //method to sort the names within the arrays alphabetically
        sortArray(namesArray);
        System.out.println("---------------------------------------------");
        sortArray(fileArray);
        System.out.println("---------------------------------------------");

        //method to search for a specific name among the elements within an array
        searchName(namesArray, "Adam");
        searchName(fileArray, "Johnathan");
        System.out.println("---------------------------------------------");

    }

        /*populate an array with names from a text file*/
        public static String[] fillArray(String fileName) throws IOException{
            //declaring a list to hold the names for an array
            List<String> listOfNames = new ArrayList<>();

            //initializing a buffered reader to take the file name and directory
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            //this method will read each line within the text file and convert them to strings
            String line = bf.readLine();

            //a loop method to add each name from the text file to the list
            while (line != null){
                listOfNames.add(line);
                line = bf.readLine();
            }
            //line to end the buffered reader
            bf.close();

            //return the list of names as a String Array
            return listOfNames.toArray(new String[0]);
        }

        /*sort the elements in an array*/
        public static void sortArray(String[] array){
            /*
         Sorts an array of String using a Sort Algorithm  (apply one sort algorithm)
         Algorithm:
         1. go through each element within the array
         2. compare the current element with the next element
         3. if the next element should come before the next, move the elements accordingly
         4. repeat until all elements are sorted alphabetically
         */

            //display each element in the array before sorting
            System.out.println("Before Sorting: ");
            showElements(array);

            //these lines will compare each element to the next and move them based on alphabetical order
            for (int i = 0;i< array.length; i++){
                for (int j = i+1; j < array.length; j++){
                    if(array[i].compareTo(array[j])>0){
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            //this method is to display the elements of an array after they have been sorted
            System.out.println("After Sorting: ");
            showElements(array);
        }
        /* Displays the elements of an array of strings */
        public static void showElements(String[] array){
            for (String s : array) {
                System.out.print(s+", ");
            }
            System.out.println("");
        }
        /*Show if a name is present within an array*/
        public static void searchName(String[] array, String name){
                for (String s : array) {
                    if (Objects.equals(s, name)) {
                        System.out.println(name + " was found");
                    } else {
                        System.out.println(name + " could not be found");
                    }
                    break;
                }
        }
    }
    /* Sample Run:
C:\Users\Karlo\.jdks\corretto-16.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=51007:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Karlo\Documents\PC\AREAS\SLU\CS211\CS211_9344_DelaPenaKarloRafael\out\production\CS211_9344_DelaPenaKarloRafael Prelim.DelaPenaProgrammingExercise1
Array from main method:
John, Luke, Keith, Adam, Kaleb,
---------------------------------------------
Array from text file:
Joseph, Gabriel, Cassandra, Mira, Daniel, Alexander,
---------------------------------------------
Before Sorting:
John, Luke, Keith, Adam, Kaleb,
After Sorting:
Adam, John, Kaleb, Keith, Luke,
---------------------------------------------
Before Sorting:
Joseph, Gabriel, Cassandra, Mira, Daniel, Alexander,
After Sorting:
Alexander, Cassandra, Daniel, Gabriel, Joseph, Mira,
---------------------------------------------
Adam was found
Johnathan could not be found
---------------------------------------------

Process finished with exit code 0
*/
