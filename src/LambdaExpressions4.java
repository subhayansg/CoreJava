/*
Method reference
On a functional interface we can assign a reference to a method
 */
@FunctionalInterface
interface IMyLambda4 {
    void display(String str);
}

public class LambdaExpressions4 {
    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public void toUpper(String str) {     // non-static method
        System.out.println(str.toUpperCase());
    }

    public LambdaExpressions4() {   // default constructor
    }

    public LambdaExpressions4(String s) {   // parameterized constructor
        System.out.println(s.toLowerCase());
    }

    public static void main(String[] args) {
        IMyLambda4 m = System.out::println;   // object.class::method, as static methods can be accessed using only classname
        m.display("Hello!");  // when we call display, internally println will get called

        IMyLambda4 m2 = LambdaExpressions4::reverse;    // class::method
        // Here the method must only take one parameter of String type, same as interface method, which is getting overridden
        m2.display("example");

        LambdaExpressions4 le = new LambdaExpressions4();
        IMyLambda4 m3 = le::toUpper;    // object::method
        m3.display("hello");

        IMyLambda4 m4 = LambdaExpressions4::new;
        m4.display("HELLO");
    }
}
