package com.subhayan.collections;

import java.util.TreeSet;

class Point implements Comparable<Point> {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        if (this.x > p.x)
            return 1;
        else if (this.x == p.x) {
            if (this.y > p.y)
                return 1;
            else if (this.y < p.y)
                return -1;
            else
                return 0;
        }
        else
            return -1;
    }

    public String toString() {
        return "X: " + x + " and y: " + y;
    }
}

public class TreeSetsComparableInterface {
    public static void main(String[] args) {
        TreeSet<Point> tsP = new TreeSet<>();
        tsP.add(new Point(1, 1));
        tsP.add(new Point(5, 5));
        tsP.add(new Point(5, 2));
        // As Java does not know how to compare points, we need to override compareTo method of Comparable interface
        // In case of TreeSet<Integer>, Java uses the default compareTo to compare the items in the TreeSet object
        System.out.println(tsP);
    }
}
