import java.util.Scanner;

public class jalan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        System.out.println("Enter Position");
        int p = in.nextInt();
        System.out.println("Enter Direction");
        int d = in.nextInt();
        if (d == 0) {
            int temp[] = new int[p];
            System.out.println("Expected output is : ");
            for (int i = 0; i < p; i++) {
                temp[i] = arr[i];
            }
            for (int i = p; i < arr.length; i++) {
                System.out.print(" " + arr[i]);
            }
            for (int i = 0; i < temp.length; i++) {
                System.out.print(" " + temp[i]);
            }
        } else {
            System.out.println("Expected output is : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(" " + arr[i]);
            }
        }

    }
}
