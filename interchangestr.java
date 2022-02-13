import java.util.Scanner;

public class interchangestr {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int n = 0, i = 0;
        System.out.print("enter array size \n");
        n = mk.nextInt();
        mk.skip(System.lineSeparator());
        String[] arr = new String[n];
        for (i = 0; i < n; i++) {
            System.out.println("enter your friends name " + (i + 1));
            arr[i] = mk.nextLine();
        }
        System.out.print("your friends are \n");
        for (i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
