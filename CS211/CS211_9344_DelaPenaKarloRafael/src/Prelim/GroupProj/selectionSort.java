package Prelim.GroupProj;

import java.util.ArrayList;

class SelectionSort<T extends Comparable<T>> {
    T t;


    private boolean izTrue(T a, T b) {
        if (a.compareTo(b) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
