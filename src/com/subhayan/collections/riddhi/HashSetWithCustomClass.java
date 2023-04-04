package com.subhayan.collections.riddhi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetWithCustomClass {
    public static void main(String[] args) {
        List<StudentMarks> stMarks = new ArrayList<>();
        stMarks.add(new StudentMarks(70, 80));
        stMarks.add(new StudentMarks(38, 10));
        stMarks.add(new StudentMarks(100, 38));
        stMarks.add(new StudentMarks(40, 88));
        stMarks.add(new StudentMarks(97, 19));

        Set<StudentMarks> set1 = new HashSet<>(stMarks);
        System.out.println(set1.contains(new StudentMarks(70, 80)));
        // This returns False when we didn't override hashCode and equals methods
        // But the set has the 70, 80 value as can be seen from below
        for(StudentMarks x : set1)
            System.out.println(x + ", ");
        // The reason for that is, the HashSet uses the Object class' hashCode() method
        // to generate the hash code for both objects and uses the default equals() method
        // And the default hashCode method returns the memory address of the two objects which are not same
        // In order to avoid this, when we are using HashSet with custom class
        // We need to override equals() and hashCode() methods in the custom class
    }
}
