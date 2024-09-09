package Prelim;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int listSize = 0;
        Scanner kbd = new Scanner(System.in);
        List<String> itemList = new ArrayList<String>();

        System.out.print("How many items will you be entering? : ");
        listSize = kbd.nextInt();
        itemList = new ArrayList<>(listSize);
        if(listSize>5){
            throw new ListOverflowException("This array cannot store more than 5 items", new RuntimeException());
        }
        for (int i = 0; i < listSize; i++){
            System.out.print("For item "+(i+1)+", what is the model number? : ");
            String modelNumber = kbd.next();
            System.out.print("What is the items color? : ");
            String color = kbd.next();
            System.out.print("What is the current status of the item? : ");
            String status = kbd.next();


        }

        MyFixedArrayList itemArray = new MyFixedArrayList(itemList);
    }
}