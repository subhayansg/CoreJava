package com.subhayan.lambdas;

public class Greeter {
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting MyLambdaForGreet = () -> System.out.println("Hello from lambda!"); // using lambda
        greeter.greet(MyLambdaForGreet);

        Greeting greet = new Greeting() {    // using anonymous inner class
            @Override
            public void perform() {
                System.out.println("Hello from anonymous inner class!");
            }
        };
        greet.perform();
    }
}
