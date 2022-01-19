import java.util.*;

public class detect {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        System.out.println("Enter Number");
        // int num = mk.nextInt();
        boolean b = mk.hasNextInt();
        if (b == true) {
            System.out.println("intiger");
        } else {
            System.out.println("any other data type");
        }

    }
}
