import java.util.Scanner;

public class add2matrix {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int m1[][] = new int[10][10];
        int m2[][] = new int[10][10];
        int m3[][] = new int[10][10];
        int i = 0, j = 0, row = 0, col = 0, row1 = 0, col1 = 0;
        System.out.print("enter amtrix size in row and column \n");
        row = mk.nextInt();
        col = mk.nextInt();

        System.out.print("input first matrix data \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                m1[i][j] = mk.nextInt();
            }
        }

        System.out.print("enter second mtrix size in row and column \n");
        row1 = mk.nextInt();
        col1 = mk.nextInt();
        System.out.print("input matrix second data \n");
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col1; j++) {
                m2[i][j] = mk.nextInt();
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(" " + m1[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (i = 0; i < row1; i++) {
            for (j = 0; j < col1; j++) {
                System.out.print(" " + m2[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        if ((row == row1) && (col == col1)) {
            System.out.print("Addiction of two matrix value is \n");
            System.out.print("input matrix data \n \n");
            for (i = 0; i < row; i++) {
                for (j = 0; j < col; j++) {
                    m3[i][j] = m1[i][j] + m2[i][j];
                    System.out.print(" " + m3[i][j]);
                }
                System.out.print("\n");
            }
        } else {
            System.out.print("Addiction is not possible due to unequall of row and column number");
        }

    }
}
