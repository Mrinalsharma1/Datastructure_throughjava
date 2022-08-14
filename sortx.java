import java.util.*;

public class sortx {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 5;
        // arr[1] = 3;
        arr[2] = 2;
        arr[3] = 1;
        arr[4] = 4;

        Arrays.sort(arr);
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (arr[i] != j) {

                System.out.println("missing value:" + j);
                break;
            }
        }

    }
}