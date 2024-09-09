package Prelim.GroupProj;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Sorts<String> sortie = new Sorts<>();
        ArrayList<String> butom = new ArrayList<>();
        ArrayList<String> copya = new ArrayList<>();
        butom.add("basit");
        butom.add("takim");
        butom.add("ta Ulom");
        butom.add("maawawan");

        copya.addAll(butom);

        System.out.println(butom.toString());
        System.out.println(sortie.bubbleSort(copya));
        System.out.println(copya.toString());
        copya.removeAll(copya);
        copya.addAll(butom);
        System.out.println(sortie.selectionSort(copya));
        System.out.println(copya.toString());
    }
}
