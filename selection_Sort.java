public class selection_Sort {
    public static void main(String[] args) {
        int arr[] = { 10, 3, 4, 22, 6, 88, 8, 2, 1 };
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            int j;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        for (int a : arr) {
            System.out.print(" " + a);
        }
    }
}
