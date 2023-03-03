class Super {
    public void display() {
        System.out.println("Super Display");
    }
}

class Sub extends Super {
    public void display() {    // overridden method
        System.out.println("Sub Display");
    }

    public void newDisplay() {
        System.out.println("New display");
    }
}

public class Override {
    public static void main(String[] args) {
        Super sup = new Sub();  // Super reference, sub class object
//	  Sub s = new Super();    // Sub reference, super class object NOT POSSIBLE
        sup.display();          // method available in Super class, allowed
//        sup.newDisplay();       // method not available in Super class, NOT ALLOWED
    }
}