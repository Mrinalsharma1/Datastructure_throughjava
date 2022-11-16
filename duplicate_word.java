import java.util.Scanner;

public class duplicate_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "1Samantha";
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '?') {
                System.out.println("INVALID");
                flag = 1;
            } else if (str.length() < 8) {
                System.out.println("INVALID");
                flag = 1;
            }
        }
        if (flag != 1) {
            if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
                System.out.println("VALID");
            } else if (Character.isDigit(str.charAt(0))) {
                System.out.println("INVALID");
            }
        }
    }
}
