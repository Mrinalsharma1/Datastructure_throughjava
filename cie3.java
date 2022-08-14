
// Q1. first question
import java.util.Scanner;
import java.lang.Math;

public class cie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        int temp;
        try {
            if (Integer.parseInt(str) > 0) {
                temp = Integer.parseInt(str);
                System.out.println(Math.sqrt(temp));
            }
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("given input is not a number" + e);
        }
    }
}
