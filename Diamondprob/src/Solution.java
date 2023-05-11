interface A {
    default void display() {
        System.out.println("Interface A");
    }
}

interface B extends A {
    default void display() {
        System.out.println("Interface B");
    }
}

interface C extends A {
    default void display() {
        System.out.println("Interface C");
    }
}

class D implements B, C {
    @Override
    public void display() {
        B.super.display(); // Calling display() method of Interface B
        C.super.display(); // Calling display() method of Interface C
    }
}

public class Solution{
    public static void main(String[] args) {
        D d = new D();
        d.display();
    }
}
