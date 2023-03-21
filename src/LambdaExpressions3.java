@FunctionalInterface
interface IMyLambda3 {
    void display();
}

class MyClass {
    int instanceVariable = 10;
    public void method1() {
        int localToMethod = 0;                  // better declare it as final
        IMyLambda3 ml = () -> {
            int local = 0;                      // lambda expression can have local variables
            System.out.println(local);
            local++;                            // this local variable can be altered
            System.out.println(localToMethod);  // Lambda expression can have multiple statements in it,
                                                // it can access only final variables declared out of its context
            System.out.println(instanceVariable);
        };
//        localToMethod++;  // this is NOT ALLOWED; Variable used in lambda expression should be final or effectively final
        instanceVariable++; // this is ALLOWED as this is an instance variable
    }
}

// Use lambda expression as parameter of a method
class UseLambdaAsParam {
    public void callLambda(IMyLambda3 ml) {   // Taking functional interface as parameter,
                                              // we can pass lambda expression to this function as parameter [***]
        ml.display();
    }
}

class DemoOfLambdaCall {
    public void method2() {
        UseLambdaAsParam ulp = new UseLambdaAsParam();
        ulp.callLambda(() -> System.out.println("Hello!"));  // [***]
    }
}

public class LambdaExpressions3 {
    public static void main(String[] args) {
        DemoOfLambdaCall d = new DemoOfLambdaCall();
        d.method2();
    }
}
