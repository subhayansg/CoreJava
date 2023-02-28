public class Varags {
    static void show(int ... x) {
        for(int a: x) {
            System.out.println("show: " + a);
        }
        System.out.println("");
    }
    static void show2(int x, int ... y) {    // varag must be the last argument, can't have multiple varags
        for(int a: y) {
            System.out.println("show2, x: " + x + ", a: " + a);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        show();
        show(10);
        show(10, 20);
        show(10, 20, 30);
        show(new int[]{10,20,30,40});

//        show2();    // this is not valid as we must pass an int parameter
        show2(10);
        show2(10, 20);
        show2(10, 20, 30);
        show2(10, new int[]{10,20,30,40});
    }
}
