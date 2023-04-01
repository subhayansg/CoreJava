package com.subhayan.collections.riddhi;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueLearn {
    public static void main(String[] args) {
        List<StudentMarks> stMarks = new ArrayList<>();
        stMarks.add(new StudentMarks(70, 80));
        stMarks.add(new StudentMarks(38, 10));
        stMarks.add(new StudentMarks(100, 38));
        stMarks.add(new StudentMarks(40, 88));
        stMarks.add(new StudentMarks(97, 19));

        // Get top 3 students according to their maths marks
        PriorityQueue<StudentMarks> spq = new PriorityQueue<>(stMarks);  // add all Student Marks to the PQ

        List<StudentMarks> top3 = new ArrayList<>();
        int index = 0;
        while (!spq.isEmpty()) {
            if (index == 3)      // we need top 3 --> 0, 1, 2
                                 // The sorting logic is implemented by the StudentMarks class by implementing the
                                 // Comparable interface's compareTo() method
                                 // It basically is the comparison strategy
                                 // we need to implement the strategy to find top 3 student by maths mark
                                 // This ordering is implemented by class --> Natural Ordering --> Comparable
                break;
            top3.add(spq.poll());  // removes the first element of the Queue and adds to the top3 list
            index++;
        }
        System.out.println(top3);

        // In case of PriorityQueue<Integer>, we can't override the default behaviour of the (to get top 3 instead of bottom 3)
        // compareTo() method written in the Integer class
        // In that case we need Comparator

        // Let's try to get the top 2 elements of an PriorityQueue<Integer>
        // Without Comparator it prints [0, 1] as they are the bottom 2 elements after comparison
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCustomComparator()); // [100, 2] --> as top 2
                                        // This ordering is passed to the PQ --> Total Ordering --> Comparator
        /* The above code can be written using lambdas like below */
        PriorityQueue<Integer> pqL = new PriorityQueue<>((a, b) -> b - a);

        pq.offer(1);
        pq.offer(2);
        pq.offer(0);
        pq.offer(100);

        List<Integer> top2 = new ArrayList<>();
        index = 0;
        while (!pq.isEmpty()) {
            if (index == 2)
                break;
            top2.add(pq.poll());
            index++;
        }
        System.out.println(top2);
    }
}
