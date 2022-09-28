class demo {
    void display() {
        System.out.println("hello demo");
    }
}

class demo1 extends demo {
    void display() {
        System.out.println("hello demo1");
    }
}

public class overiding1 {
    public static void main(String[] args) {
        demo obj = new demo1();
        obj.display();
    }
}
