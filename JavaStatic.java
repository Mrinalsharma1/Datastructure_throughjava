import java.util.Scanner;

public class JavaStatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        // int B = 4, H = -1;
        // System.out.println("hii");
        try {
            if (B > 0 && H > 0)
                System.out.println(B * H);
            else
                System.out.println("java.lang.Exception: Breadth and height must be positive");
        } catch (Exception e) {
            // System.out.println(e + "java.lang.Exception: Breadth and height must be");
            // positive");
        }

    }
}
