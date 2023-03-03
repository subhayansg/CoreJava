interface Test {
    void meth1();
    void meth2();
}
// Interfaces will only have abstract methods, no need to specify specifically
// As interfaces are abstract, it can't be instantiated
// Interfaces are used to achieve Polymorphism

class My implements Test {
    public void meth1() {
        System.out.println("Meth1 of class My");
    }
    public void meth2() {
        System.out.println("Meth2 of class My");
    }
    public void meth3() {
        System.out.println("Meth3 of class My");
    }
}

public class Interface {
    public static void main(String[] args) {
        Test t;       // creating reference of interface ALLOWED
        t = new My(); // ALLOWED to assign object of child class
        t.meth1();
        t.meth2();
    }
}
