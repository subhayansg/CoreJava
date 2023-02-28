class Rectangle2 {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double b) {
        if (b >= 0)
            breadth = b;
        else
            breadth = 0;
    }

    public void setLength(double l) {
        if (length >= 0)
            length = l;
        else
            length = 0;
    }

    public double area() {
        return getLength() * getBreadth();
    }

    public double perimeter() {
        return 2 * (getBreadth() + getLength());
    }

    // Non-parameterized constructor
    public Rectangle2() {
        length = 1;
        breadth = 1;
    }

    // Parameterized constructor
    public Rectangle2(double l, double b) {
//        length = l;
        setLength(l);
//        breadth = b;
        setBreadth(b);
    }

    public Rectangle2(double s) {
//        length=breadth=s;
        setBreadth(s);
        setLength(s);
    }
}

public class Constructors {

    public static void main(String[] args) {

        Rectangle2 r1 = new Rectangle2(10, 20);

        System.out.println("Area: " + r1.area());

    }
}

