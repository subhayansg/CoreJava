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

public class LambdaExpressions {
    public static void main(String[] args) {
//        IMyLambda m = new MyClass();       // standard way of accessing display() method
        // use lambda
        IMyLambda m = () -> System.out.println("Hello World using lambda expression!");  // lambda expression, so ';' is needed
        m.display();
    }
}
