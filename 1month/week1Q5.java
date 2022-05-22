import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class week1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list=new ArrayList<Integer>(); 
        for(int i=0; i<n;i++){
            int a =sc.nextInt();
            list.add(a);
        }
        // Integer[] myArray = new Integer[list.size()];
        // list.toArray(myArray);
        // int count=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0; j<n;j++){
        //         if(myArray[i] != myArray[j]){
        //             count=myArray[i];
        //         }
        //     }
        // }
        // System.out.println(count);
        int a=0;
        for(int x : list){
            a=a^x;
            System.out.println(a);
        }
        System.out.println(a);

        // System.out.println(list.get(list.size()/2));
        // System.out.println(list);
        // HashSet<Integer> hset = new HashSet<Integer>(list);
        // List<Integer> list1=new ArrayList<Integer>(hset); 
        // Collections.sort(list1);
        // System.out.println(list1);
        // System.out.println(list1.get(list1.size()-1));
    }
    
}
