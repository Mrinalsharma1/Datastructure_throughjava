import java.util.Scanner;
import java.lang.*;

public class arraydfi {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int arr[] = new int[10];
        int i = 0, n = 0, item = 0;
        System.out.print("enter no of array element \n");
        n = mk.nextInt();
        System.out.print("enter no of elements " + n + "\n");
        for (i = 0; i < n; i++) {
            arr[i] = mk.nextInt();
        }
        System.out.print("enter index no where you want to delete \n");
        item = mk.nextInt();
        for (i = item; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        n = n - 1;
        for (i = 0; i < n; i++) {
            System.out.println("item is :" + arr[i]);
        }
        System.out.print("thanks to used our software");
    }
}
