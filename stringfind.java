import java.util.Scanner;

public class stringfind {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        System.out.print("enter array length \n");
        int n = mk.nextInt();
        String str[] = new String[n];
        System.out.print("enter items \n");
        for (int i = 0; i < n; i++) {
            str[i] = mk.next();
        }
        System.out.print("work on first items \n");
        for (int i = 0; i < n; i++) {
            char[] ch = str[i].toCharArray();
            // System.out.println("Character item... \n");
            for (int j = 0; j < ch.length; j++) {
                System.out.print(ch[j] + " ");
            }
            System.out.println(" \n");
        }
        System.out.print("show entire items \n");
        for (int i = 0; i < n; i++) {
            System.out.print(" \t" + str[i]);
        }

    }
}
