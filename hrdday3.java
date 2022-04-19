import java.util.Scanner;
import java.util.Arrays;   
public class hrdday3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int y = in.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("sorted array is");
        System.out.println(arr[y-1]); 
       
    }
}
