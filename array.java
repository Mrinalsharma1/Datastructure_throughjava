import java.util.Scanner;
import java.awt.*;

public class array {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("enter length of element ");
        int n = mk.nextInt();
        System.out.println("enter " + n + " item \n");
        for (int i = 0; i < n; i++) {
            arr[i] = mk.nextInt();
        }
        System.out.print("inserted value is \n");
        for (int i = 0; i < n; i++) {
            System.out.println("item is :" + arr[i]);
        }
    }
}
