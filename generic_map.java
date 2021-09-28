import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class generic_map {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 1; i <= 5; i++) {
            // System.out.println("enter your roll number");
            // int roll = obj.nextInt();
            System.out.println("enter your " + i + " name");
            String name = obj.next();
            map.put(i, name);
        }

        // map.put(2, "Suraj");
        // map.put(3, "Ganesh");
        // map.put(4, "Sashi");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();

        System.out.println(" == printing Start == ");
        while (itr.hasNext()) {
            Map.Entry e = itr.next();

            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
