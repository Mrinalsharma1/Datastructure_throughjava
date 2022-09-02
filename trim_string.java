import java.util.Scanner;

public class trim_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "He is a very very good boy, isn't he?";
        // Write your code here.
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        }
        // String[] results = s.split("[\s,!?._'@]+"); // You may use it as well
        System.out.println(s.split("[regex]"));
        // String[] results = s.split("[^A-Za-z]+");

        // System.out.println(results.length);

        // for (String str : results) {
        // System.out.println(str);
        // }
        scan.close();
    }
}
