import java.util.Arrays;
import java.util.Scanner;

public class hrdq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int t=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int temp =arr.length-t;
        System.out.println(temp);
        int res = 0;

        for (int i = arr.length-1; t >0; i--,t--) { 
            // if(t == 0)
            //     break; 
            res += arr[i];
            // t--;
        }  
        System.out.println("value is: "+res);
    }
}
