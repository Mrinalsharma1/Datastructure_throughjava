import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();  
        list.add("mango");
        list.add("list");
        list.add("banaba");
        for(String x:list){
            System.out.println(x);
        }
        System.out.println(list.get(2));

    }
}
