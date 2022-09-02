public class insertion_Sort {
    public static void main(String[] args) {
        int arr[] = { 10, 30, 4, 6, 22, 7, 1 };
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
        for (int a : arr) {
            System.out.print(" " + a);
        }
    }
}
