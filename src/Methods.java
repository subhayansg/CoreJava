import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Methods m = new Methods();
        m.callMeAwesome();
    }

    void callMeAwesome() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name + ", you're awesome!");
    }
}
