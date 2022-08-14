class exam {
    int x, y;

    exam() {
        x = 10;
        y = 20;
        System.out.println("print constructer");
    }

    {
        System.out.println("print initilizer");
    }

    exam(int a, int b) {
        this.x = a;
        this.y = b;
    }

    void display() {
        System.out.println("sum of two no is:" + (x + y));
    }
}

public class lab3 {
    public static void main(String[] args) {
        exam obj = new exam();
        // obj.display();
        // exam obj1 = new exam(5, 5);
        // obj1.display();
    }
}
