public class Variables {
    int id; // Instance variables get default value 0
//    We can have static variables here which will also have default value
//    We can only declare variables here, can't initialize
//    id = 100; fails

    void func() {
        int id2; // If we try printing this, it'll fail as this is a local variable
        System.out.println(id);
//        System.out.println(id2);
    }

    public static void main(String[] args) {
        Variables v = new Variables();
        v.func();
    }
}
