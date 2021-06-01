import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int arr[] = new int[10];
        int i = 0, n = 0, j = 0;
        System.out.print("enter array size \n");
        n = mk.nextInt();
        System.out.print("enter array item \n");
        for (i = 0; i < n; i++) {
            arr[i] = mk.nextInt();
        }
        System.out.print("array item is \n");
        for (i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.print("\n");
        System.out.print("reverse array item is \n");
        for (j = n; j > 0; j--) {
            arr[i] = j;
            System.out.print(" " + arr[i]);
        }

    }
}
