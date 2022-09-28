import java.util.Arrays;
import java.util.Scanner;

public class happy_mind1 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = "acbdabe";
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[j] < ch[i]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println(ch);
    }

}
