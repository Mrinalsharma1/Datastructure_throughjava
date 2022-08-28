public class Array_Row_Add {
    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 1, 1 }, { 4, 5, 6, 1 }, { 1, 1, 1, 1 }, { 2, 2, 2, 1 } };
        int sum = 0;
        // System.out.println(arr.length);
        for (int i = 0; i <= 3; i++) {
            // System.out.println("Index i is -> " + i);
            if (i > 0 && i <= 2) {
                // System.out.println("Index in i is -> " + i);
                continue;
            }
            for (int j = 0; j <= 3; j++) {
                // System.out.println("index j is -> " + arr[i][j]);
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
