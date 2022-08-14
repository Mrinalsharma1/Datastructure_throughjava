import java.util.ArrayList;
import java.util.Collection;

public class arraylistex {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(10);
        obj.add(20);
        System.out.println("Array list is : " + obj);
        obj.add(50);
        obj.add(30);
        System.out.println("Updated Array is :" + obj);
    }
}
