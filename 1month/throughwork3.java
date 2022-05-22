import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class throughwork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hello world";
        System.out.println("duplicate string is : " + str);
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
            System.out.println(newstr.indexOf(ch) + "\n");
            if (newstr.indexOf(ch) == -1) {
                newstr += ch;
            }
        }
        System.out.println(newstr);

        // for (int i = 0; i < str.length(); i++) {
        // for (int j = i + 1; j < str.length(); j++) {
        // if (inp[i] == inp[j]) {
        // System.out.print(" " + inp[j]);
        // }
        // }
        // }
        // char ch[]= str.toCharArray();
        // HashSet<Character> chr = new HashSet<Character>();
        // for (int i = 0; i < str.length(); i++) {
        // System.out.print(str.charAt(i));
        // chr.add(str.charAt(i));
        // }
        // System.out.print(chr);
        // for (Character s : chr) {
        // System.out.print(" " + s);
        // }

    }
}
