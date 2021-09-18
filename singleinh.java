class animal {
    void eat() {
        System.out.print("eating...\n");
    }
}

class dog extends animal {
    void bark() {
        System.out.print("barking... \n");
    }
}

class cat extends dog {
    void sleep() {
        System.out.print("sleeping... \n");
    }
}

public class singleinh {
    public static void main(String[] args) {
        cat mk = new cat();
        // cat mk1 = new cat();
        mk.eat();
        mk.sleep();
        mk.bark();
    }
}
