import java.io.*;

public class args {
    static void sum(int y) {
        y = 20;
    }

    static void change(int arr[]) {
        arr[0] = 30;
    }

    static void add(int... arr) {
        int result = 0;
        for (int a : arr) {
            result = result + a;
        }
        System.out.printf("sum of number is %d \n", result);
    }

    public static void main(String[] args) {
        int x = 10;
        sum(x);
        System.out.printf("number is %d \n", +x);
        int arr[] = { 10, 20, 30, 40 };
        change(arr);
        System.out.printf("index is %d \n", +arr[0]);
        add(10);
        add(10, 20, 30);

    }
}
