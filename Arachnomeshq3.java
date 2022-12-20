import java.util.Arrays;
import java.util.Scanner;

public class Arachnomeshq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int f = arr[0];
        int l = arr[n - 1];
        float sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == f || arr[i] == l) {
                sum = sum + arr[i];
                count++;
            }
        }
        System.out.println(sum / count);
    }
}