import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int m1[][] = new int[10][10];
        int n = 0, i = 0, j = 0, sum = 0, sum1 = 0;
        System.out.print("enter array size \n");
        n = mk.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                m1[i][j] = mk.nextInt();
            }
            System.out.print("\n");
        }
        System.out.print("show array data \n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(" " + m1[i][j]);
            }
            System.out.print("\n");
        }

        System.out.print("sum of array data \n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                sum = sum + m1[i][i];
                i++;
            }
            System.out.print("\n");
        }
        System.out.print("sum of number is " + sum + "\n");

        for (i = 0; i < n; i++) {
            for (j = n - 1; j > 0; j--) {
                // sum1 = sum1 + m1[i][j];
                sum1 = sum1 + m1[i][j];
                System.out.print(" " + sum1);
                i++;
            }
            System.out.print("\n");
        }
        System.out.print("sum of 2nd number is " + sum1);

    }
}
