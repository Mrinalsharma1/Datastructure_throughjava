
// Java program for the above approach
import java.util.*;

class prefect_sq {
    static void countSquares(int arr[], int n) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            if (Math.ceil((double) Math.sqrt(x)) == Math.floor((double) Math.sqrt(x))) {
                System.out.print(" " + arr[i]);
            } else {
                // System.out.print("not a perfect square");
            }
        }

    }

    public static void main(String[] args) {

        int arr[] = { 36, 9, 4, 16, 25, 1, 49, 776 };

        int N = arr.length;
        countSquares(arr, N);
    }
}
