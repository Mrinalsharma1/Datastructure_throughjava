import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        int a = x / 3;
        // System.out.println(a);
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                // System.out.println(i);
                sum += i;
            }

        }
        System.out.println(sum);

    }
}
