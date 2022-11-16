import java.util.Scanner;

public class sumsof_diagonals {
    public static int[] sumOfDiagonal(int[][] arr) {
        int sum = 0, sum1 = 0;
        int x[] = { 4, 5 };
        // for (int i = 0, k = arr.length - 1; i < arr.length; k--, i++) {
        // sum += arr[i][i];
        // sum1 += arr[i][k];
        // }
        // return sum - sum1;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = { { 1, 2, 10 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int sum = sumOfDiagonal(arr);

        int arr1[] = sumOfDiagonal(arr);

        for (int i : arr1) {
            System.out.println(i);
        }
        // System.out.println("Digonal diffirence is : " + sum);
    }
}
