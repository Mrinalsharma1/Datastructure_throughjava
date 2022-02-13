import java.util.Scanner;

public class natural_number {
    public static void main(String[] args) {
        // natural number from 100 to 200
        int num = 100;
        while (num <= 200) {
            System.out.println("Natural number is :- " + num);
            num++;
        }

        // print first n natural number using do while

        // int n, i = 1;
        // Scanner mk = new Scanner(System.in);
        // System.out.println("Enter number till you want to print natural number");
        // n = mk.nextInt();
        // do {
        // System.out.println("print N number is :- " + i);
        // i++;

        // } while (i <= n);

        // print first n odd numbers using a for loop.
        // int n;
        // Scanner mk = new Scanner(System.in);
        // System.out.println("Enter number till you want to print odd number");
        // n = mk.nextInt();
        // for (int i = 0; i < n; i++) {
        // if (i % 2 == 1) {
        // System.out.println("odd num is : " + i);
        // }
        // // else
        // // System.out.println("num is odd : " + i);
        // }

        // for (int i = 0; i <= 5; i++) {
        // for (int j = 5; j > i; j--) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // sum first n even numbers using a while loop
        // int i = 0, n = 10, sum = 0;
        // while (i <= n) {
        // if (i % 2 == 0) {
        // System.out.println("even is " + i);
        // sum = sum + i;
        // }
        // i++;
        // }
        // System.out.println("Sum of even number is :- " + sum);

        // print the multiplication table of a given number n
        int i = 10, n = 10;
        while (i >= 1) {
            System.out.println("table of " + n + " x " + i + " = " + n * i);
            i--;
        }
    }
}
