import java.util.Scanner;
import java.lang.*;

public class arrayufun {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int arr[] = new int[10];
        int n = 0, i = 0, item = 0, loc = 0;
        System.out.print("enter no of array index you want \n");
        n = mk.nextInt();
        System.out.println("enter no of item is \n");
        for (i = 0; i < n; i++) {
            arr[i] = mk.nextInt();
        }
        System.out.print("enter your updated value and its location\n");
        item = mk.nextInt();
        loc = mk.nextInt();
        arr[loc - 1] = item;

        for (i = 0; i < n; i++) {
            System.out.println("updated item is :" + arr[i]);
        }
        System.out.print("thanks to used our software");
    }
}
