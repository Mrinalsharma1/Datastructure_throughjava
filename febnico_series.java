import java.util.Scanner;

public class febnico_series {
    static int febo1(int x) {
        int z = x;
        if (z < 1) {
            return 1;
        } else {
            int a = 0, b = 1, c;
            c = a + b;
            a = b;
            b = c;
            return z + febo1(z - 1);
        }
    }

    public static void main(String[] args) {
        // int n;
        // int a = 0, b = 1, c;
        // Scanner mk = new Scanner(System.in);
        // System.out.print("Enter number :- ");
        // n = mk.nextInt();
        // for (int i = 1; i <= n; i++) {
        // System.out.printf("\t %d", +a);
        // c = a + b;
        // a = b;
        // b = c;

        // }
        Scanner mk = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int num = mk.nextInt();
        System.out.printf("\t %d", +febo1(num));
    }
}
