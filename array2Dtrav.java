import java.util.Scanner;

public class array2Dtrav {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int mat[][] = new int[10][10];
        int row = 0, col = 0, i = 0, j = 0;
        System.out.print("enter number of row \n");
        row = mk.nextInt();
        System.out.print("enter number of column \n");
        col = mk.nextInt();
        System.out.print("input the element of array \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat[i][j] = mk.nextInt();
            }
        }

        System.out.print("\n Traversing in row  major order \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(" " + mat[i][j]);

            }
            System.out.print("\n");
        }

        System.out.print("\n Traversing in column  major order \n");
        for (j = 0; j < col; j++) {
            for (i = 0; i < row; i++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.print("\n");
        }
    }
}
