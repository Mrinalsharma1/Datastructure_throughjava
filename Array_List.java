import java.util.*;

public class Array_List {
    // Insert Value In Array_List
    static void Insert(int x) {
        ArrayList<Integer> arr = new ArrayList<Integer>(x);
        for (int i = 0; i < x; i++) {
            arr.add(i + 10);
        }
        // Display The Array_List
        System.out.println(arr);

        // Print First Index Value
        System.out.println(14 == (arr.get(4)) ? true : false);
    }

    public static void main(String[] args) {

        // Scanner in = new Scanner(System.in);
        Array_List.Insert(5);

    }
}
