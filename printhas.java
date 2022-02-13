import java.util.Scanner;

public class printhas {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int n = 0, i = 0, j = 0;
        // System.out.println("enter number");
        n = mk.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
