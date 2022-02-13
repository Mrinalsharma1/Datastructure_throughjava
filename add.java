import java.util.Scanner;

class vichel {
    int a, b;

    // public vichel(int x, int y) {
    // a = x;
    // b = y;
    // System.out.println(x);
    // System.out.println(y);
    // }

    void car(int x, int y) {
        a = x;
        b = y;
        // System.out.println(x);
        // System.out.println(y);
    }

    void disp() {
        System.out.println("Running Display...");
        System.out.println(a);
        System.out.println(b);
    }

}

public class add {
    public static void main(String[] args) {
        vichel mk = new vichel();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = obj.nextInt();
        int b = obj.nextInt();
        // here is a new updated

        mk.car(a, b);
        mk.disp();

    }
}
