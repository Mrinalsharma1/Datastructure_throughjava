import java.util.ArrayList;
import java.util.Scanner;

public class happy_mind2 {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int n = mk.nextInt();
        ArrayList<String> str = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            str.add(mk.next());
        }
        System.out.println(str);
    }
}
