public class komal {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int temp[] = new int[k];
        int s = arr.length - k;
        // System.out.println(s);
        int temp1[] = new int[s];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k, j = 0; i < arr.length; i++, j++) {

            temp1[j] = arr[i];
            // System.out.println(temp1[j]);

        }
        for (int i = temp.length - 1; i >= 0; i--) {
            System.out.print(" " + temp[i]);
        }
        for (int i = k - 1; i >= 0; i--) {
            System.out.print(" " + temp1[i]);
        }
    }
}
