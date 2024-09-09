package Prelim;

import java.lang.*;
import java.util.List;

public class MyFixedArrayList {
    String[] newArray;
    public MyFixedArrayList(List<String> listOfItems) throws ListOverflowException {
        this.newArray = new String[5];
        if (listOfItems.size() > 5) {
            throw new ListOverflowException("List cannot have more than 5 items", new RuntimeException());
        } else {
            for (int i =0; i < listOfItems.size(); i++){
                newArray[i] = listOfItems.get(i);
            }
        }
    }
}