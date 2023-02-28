class Rectangle {
    private double length;  // This is accessible by only this class methods or properties
    private double breadth;

    // Property method: get and set
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double l) {
//        this.length = length;  // If we want to keep formal parameter and actual parameter name same
                                 // we have to use this
        if (l>0)
            length = l;
        else
            l = 0;
    }

    public void setBreadth(double b) {
//        this.breadth = breadth;
        if (b>0)
            breadth = b;
        else
            breadth = 0;
    }

    public double area() {
        return length*breadth;  // We can use getLength()*getBreadth()
    }

    public double perimeter() {
        return 2*(breadth+length);  // We can use 2*(getLength()+getBreadth())
    }

    public boolean isSquare() {
        if (length == breadth)
            return true;
        else
            return false;
    }
}
public class RectangleGettersSetters{

    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.setLength(-10.5);
        r.setBreadth(5.5);

//        r.length= 10.5; // Not allowed as length is private variable

        System.out.println("Length: " + r.getLength());
        System.out.println("Breadth: " + r.getBreadth());
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
        System.out.println("Is square: " + r.isSquare());
    }
}
