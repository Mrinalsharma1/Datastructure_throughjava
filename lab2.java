public class lab2 {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 2, 7, 30, 43, 22 };
        int n = arr.length;
        int i, j, temp;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After sorted array is");
        for (i = 0; i < n; i++) {
            System.out.print("\t" + arr[i]);
        }
    }
}
