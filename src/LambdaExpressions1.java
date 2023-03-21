/*
An interface having a single abstract method is called a functional interface.
 */
@FunctionalInterface
interface IMyLambda {
    void display();
}

// Sample class which implements IMyLambda
//class MyClass implements IMyLambda {
//    public void display() {
//        System.out.println("Hello world!");
//    }
//}

public class LambdaExpressions1 {
    public static void main(String[] args) {
//        IMyLambda m = new MyClass();       // standard way of accessing display() method
        // use lambda
        IMyLambda m = () -> System.out.println("Hello World using lambda expression!");
        // lambda expression, so ';' is needed.
        // type reference of a lambda expression will always be a functional interface.
        m.display();
    }
}
