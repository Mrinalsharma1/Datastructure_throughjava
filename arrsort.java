public class arrsort {
    public static void main(String[] args) {
        // int arr[] = { 2, 3, 5, 3, 5, 4, 7, 8, 4, 8 };
        String arr[] = { "hey", "hello", "hii", "hey" };
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i].equals(arr[j])) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                System.out.println(arr[i]);
            }
        }

    }
}
