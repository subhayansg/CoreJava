@FunctionalInterface
interface IMyLambda2 {
    int add(int a, int b);
}

public class LambdaExpressions2 {
    public static void main(String[] args) {
        IMyLambda2 m = (x, y) -> x + y;     // return keyword is not required
        System.out.println(m.add(10, 29));
    }
}
