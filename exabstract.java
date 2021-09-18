abstract class exabstract {
    abstract void display();
}

public class MyClass extends exabstract {
    void display() {
        System.out.println("this is abstract method");
    }

    public static void main(String[] args) {
        exabstract mk = new MyClass();
        mk.display();
    }
}
