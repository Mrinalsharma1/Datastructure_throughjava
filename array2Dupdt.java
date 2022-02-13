import java.util.Scanner;

public class array2Dupdt {
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
        System.out.print("enter the row and column where you want to update your item \n");
        int mr = mk.nextInt();
        int mc = mk.nextInt();
        System.out.print("enter your item \n");
        int item = mk.nextInt();
        int temp = 0;

        System.out.print("\n Traversing in row  major order \n");
        // fetching the previous value from array
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                // update the value which user wants
                temp = mat[mr][mc];
            }
            System.out.print("\n");
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(" " + mat[i][j]);
                mat[mr][mc] = item;
            }
            System.out.print("\n");
        }
        System.out.print("changed item is" + temp + "\n");

        System.out.print("\n Traversing in column  major order \n");
        for (j = 0; j < col; j++) {
            for (i = 0; i < row; i++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.print("\n");
        }
    }
}
