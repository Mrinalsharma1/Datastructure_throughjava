import java.util.Scanner;

public class stringreplace {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        System.out.print("enter array length \n");
        int n = mk.nextInt();
        String str[] = new String[n];
        System.out.print("enter array value \n");
        for (int i = 0; i < n; i++) {
            str[i] = mk.next();
        }
        int i = 0;
        for (i = 0; i < n; i++) {
            char[] ch = str[i].toCharArray();
            for (int j = 0; j < ch.length; j++) {
                System.out.print(ch[j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("reverse of caracter is \n");
        for (i = 0; i < n; i++) {
            char[] temp = str[i].toCharArray();
            int j = 0;
            for (j = temp.length - 1; j >= 0; j--) {
                System.out.print(" " + temp[j]);
            }
            System.out.print("\n");
        }
    }
}
