import java.util.*;

public class generic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rahul");
        list.add("jonny");

        String s = list.get(0);
        System.out.println("emements is:" + s);
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
