package Prelim.GroupProj;

import java.util.*;
import java.lang.*;
public class Sorts<T extends Comparable<T>>{
    T t;
    public int bubbleSort(ArrayList<T> dataSet){
        int runTime =0;
        int n = dataSet.size();
        runTime+=2;
        for (int i = 0; i < n; i++){
            runTime+=2; //incrementation for, for loop conditions above and below
            for (int j = 0; j < n-1; j++){
                runTime+=2; //runtime incrementation for if statement below and for loop condition
                if(izTrue(dataSet.get(j), dataSet.get(j+1))) {
                    T temp = dataSet.get(j); runTime++;
                    dataSet.set(j, dataSet.get(j + 1)); runTime++;
                    dataSet.set(j + 1, temp); runTime++;
                }
                runTime++; //increment for loop
            }
            runTime++; //increment for loop
        }
        runTime++;
        return runTime;
    }

    public int selectionSort(ArrayList<T> dataSet) {
        int runTime = 0;
        int n = dataSet.size();
        runTime+=2; //in mind of initialisation of for loop and for int n above
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            runTime++;
            int min_idx = i;
            runTime+=2; //in mind of initialisation of nested for loop and min_idx var above
            for (int j = i + 1; j < n; j++) {
                runTime+=2; //in mind of condition of for loop and if statement below
                if (izTrue(dataSet.get(j), dataSet.get(min_idx))) {
                    min_idx = j; runTime++;
                }
                // Swap the found minimum element with the first
                // element
                T temp = dataSet.get(min_idx); runTime++;
                dataSet.set(min_idx, dataSet.get(i)) ; runTime++;
                dataSet.set(i,temp); runTime++;
                runTime++;//increment loop
            }
            runTime++; //increment loop
        }
        runTime++;
        return runTime;
    }

    void insertionSort(T[] array) {
        // Start at the first index and iterate through to the end
        for (int i = 1; i < array.length; i++) {
            int currentIndex = i;
            // Check:
            // 1. that currentIndex is at least 1
            // 2. that the item before currentIndex is greater than the item at currentIndex
            // If both conditions are met, swap the indexes
            while (currentIndex > 0 && array[currentIndex - 1].compareTo(array[currentIndex]) > 0) {
                T temp = array[currentIndex];
                array[currentIndex] = array[currentIndex - 1];
                array[currentIndex - 1] = temp;
                currentIndex--;
            }
        }
    }


    private boolean izTrue(T a, T b){
        if(a.compareTo(b) > 0){
            return true;
        }else{
            return false;
        }
    }
}