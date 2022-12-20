import java.util.Scanner;

public class Arachnomeshq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        // Taking the value from user and storing into Array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        // int l=arr.length() to find the length of the array but here we get the array
        int avg = sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (avg == arr[i])
                count++;
        }
        System.out.println("output : " + count);

    }
}
