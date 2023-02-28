public class IncrementAndDecrement {
    public static void main(String[] args) {
        int a=2, b=3, c=4, d, e;
        d = a * b++ + c; // 2*3+4=10
        System.out.println(d);
        e = a * ++b + c; // 2*5+4=10
        System.out.println(e);
    }
}
