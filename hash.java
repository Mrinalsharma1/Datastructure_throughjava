// import java.util.HashMap;
import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
        HashSet<Integer> map = new HashSet<Integer>();
        int array[]={2,3,4,5,3,4,2,4,1,2,3,4};
        for(int i=0; i<array.length; i++){
            map.add(array[i]);
        }
        for(int a : map){
            System.out.println(a);
        }
        
        // map.put("vishal",10);
        // map.put("mrinal",20);
        // map.put("vishal",30);
        // map.put("vishal",40);
        // System.out.println("Size of the map:- "+map.size());
        // System.out.println(map);
        // if(map.containsKey("vishal")){
        //     Integer a = map.get("vishal");
        //     System.out.println("value of key :- " +a);
        // }
    } 
}
