import java.lang.*;
import java.util.Scanner;

public class array_with_harry {
    public static void main(String[] args) {
        // 1> Create an array of 5 floats and calculate their sum.

        float array1[] = { 7.5f, 3.5f, 9.5f, 2.5f, 8.5f };
        float sum = 0;
        for (float element : array1) {
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);

        // 2> Write a program to find out whether a given integer is present in an array
        // or not.

        int arr2[] = { 3, 5, 7, 9, 10, 11 };
        int count = 0;
        Scanner mk = new Scanner(System.in);
        System.out.println("Enter searching number");
        int num = mk.nextInt();
        for (int element : arr2) {
            if (element == num) {
                count++;

            }
        }
        if (count > 0) {
            System.out.println("Number is found");
        } else {
            System.out.println("Number is not found");
        }

        // 3> Write a Java program to reverse an array.
        int arr[] = { 3, 5, 7, 9, 10, 11 };
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for (int element : arr) {
            System.out.println("reverse array is " + element);
        }
    }
}
