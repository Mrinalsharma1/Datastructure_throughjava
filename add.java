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

        mk.car(10, 20);

    }
}
