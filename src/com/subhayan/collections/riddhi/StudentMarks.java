package com.subhayan.collections.riddhi;

import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks> {
    private int maths;
    private int physics;

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    public StudentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "maths=" + maths +
                ", physics=" + physics +
                '}';
    }

    @Override
    public int compareTo(StudentMarks o) {
        /* Default behaviour of the compareTo method
            current object > other object
                return 1;
            current object < other object
                return -1;
            current object == other object
                return 0;
         */
        /*
        if (this.maths < o.maths)
            return -1;
        else if (this.maths > o.maths)
            return 1;
        return 0;
         */
        // The above code can be replaced to <<return this.maths - o.maths;>>
        // Since we need top 3 marks
        return o.maths - this.maths;
    }  // this ordering class is implementing --> Natural Ordering --> Comparable

    // Need to override below two methods for this class to be used with HashSets
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentMarks that = (StudentMarks) o;
        return maths == that.maths && physics == that.physics;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maths, physics);
    }
}
