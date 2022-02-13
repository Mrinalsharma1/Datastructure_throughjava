import java.util.Scanner;

public class transpojematrix {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int row, col, i, j;
        System.out.print("enter matrix size in row and column \n");
        row = mk.nextInt();
        col = mk.nextInt();
        int arr[][] = new int[row][col];
        int tarr[][] = new int[10][10];
        System.out.print("enter matrix value \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = mk.nextInt();
            }
        }
        System.out.print("show matrix value \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.print("\n");
        }

        System.out.print("show transpoze of matrix value \n");
        for (i = 0; i < col; i++) {
            for (j = 0; j < row; j++) {
                tarr[i][j] = arr[j][i];
                System.out.print(" " + tarr[i][j]);
            }
            System.out.print("\n");
        }
    }

}
