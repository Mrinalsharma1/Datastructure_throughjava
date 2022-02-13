import java.util.Scanner;

public class arrayefai {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int arr[] = new int[10];
        int n = 0, loc = 0, item = 0, i = 0;
        System.out.print("enter size of array\n");
        n = mk.nextInt();
        System.out.print("enter " + n + "items :\n");
        for (i = 0; i < n; i++) {
            arr[i] = mk.nextInt();
        }
        System.out.print("enter item and its given position \n");
        item = mk.nextInt();
        loc = mk.nextInt();
        for (i = i + 1; i >= loc - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[loc - 1] = item;
        n = n + 1;
        System.out.print("after inserted of value is :\n");
        for (i = 0; i < n; i++) {
            System.out.println("item is :" + arr[i]);
        }
        System.out.print("thank for used our array");
    }
}
// enter item in any position of arraycls
