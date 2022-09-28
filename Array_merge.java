class Array_merge {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 8 };
        int arr1[] = { 4, 5, 6, 7 };
        int l1 = arr.length;
        int l2 = arr1.length;
        int sum = l1 + l2;
        int arr2[] = new int[sum];
        int i;
        for (i = 0; i < l1; i++) {
            arr2[i] = arr[i];
        }
        for (i = 0; i < l2; i++) {
            arr2[l1 + i] = arr1[i];
        }
        for (int x : arr2) {
            System.out.print(x + " ");
        }
    }
}