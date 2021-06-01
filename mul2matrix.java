import java.util.Scanner;

public class mul2matrix {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int ma[][] = new int[10][10];
        int mb[][] = new int[10][10];
        int mmul[][] = new int[10][10];
        int row = 0, row1 = 0, col = 0, col1 = 0, i = 0, j = 0, sum = 0, k = 0;
        System.out.print("enter row and column of matrix \n");
        row = mk.nextInt();
        col = mk.nextInt();
        System.out.print("enter first matrix value \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                ma[i][j] = mk.nextInt();
            }
        }
        System.out.print("enter row and column of matrix \n");
        row1 = mk.nextInt();
        col1 = mk.nextInt();
        System.out.print("enter second matrix value \n");
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col1; j++) {
                mb[i][j] = mk.nextInt();
            }
        }

        System.out.print("first matrix is \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(" " + ma[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("second matrix is \n");
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col1; j++) {
                System.out.print(" " + mb[i][j]);
            }
            System.out.print("\n");
        }

        System.out.print("multiply of  matrix value is \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                for (k = 0; k < col1; k++) {
                    sum = sum + ma[i][k] * mb[k][j];
                    mmul[i][j] = sum;
                }
                sum = 0;
            }
            System.out.print("\n");
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(" " + mmul[i][j]);
            }
            System.out.print("\n");
        }
    }
}
