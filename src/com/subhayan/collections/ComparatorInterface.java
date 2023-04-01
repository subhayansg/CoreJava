package com.subhayan.collections;

import java.util.Arrays;
import java.util.Comparator;

class ReverseSortComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) { // writing own reverse compare logic
        if (o1 > o2)
            return -1;
        else if (o1 < o2)
            return 1;
        return 0;
    }
}

public class ComparatorInterface {
    public static void main(String[] args) {
        Integer[] i = new Integer[] {2,4,6,8,1,3,5,7};
        Arrays.sort(i, new ReverseSortComparator());  // using custom sort logic
        // Arrays.sort(i) uses default Comparable interface
        for(int item : i)
            System.out.println(item);
    }
}
