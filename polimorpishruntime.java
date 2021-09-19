class animal {
    void run() {
        System.out.println("eating");
    }
}

class Dog extends animal {
    void run() {
        System.out.println("dog is eating");
    }
}

class Lion extends animal {
    void run() {
        System.out.println("lion is eating");
    }
}

class Cat extends animal {
    void run() {
        System.out.println("cat is eating");
    }
}

public class polimorpishruntime {
    public static void main(String[] args) {
        animal a;
        a = new Dog();
        a.run();
        a = new Lion();
        a.run();
        a = new Cat();
        a.run();

    }
}
