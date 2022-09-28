import java.util.Scanner;

public class bulb_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("0");
        } else {
            int count = 0, i = 1;
            while (i * i <= n) {
                count++;
                i++;
            }
            System.out.println(count);
        }

    }
}