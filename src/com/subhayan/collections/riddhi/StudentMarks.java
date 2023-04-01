package com.subhayan.collections.riddhi;

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
}
