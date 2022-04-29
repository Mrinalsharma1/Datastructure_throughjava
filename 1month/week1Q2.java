import java.util.Arrays;
import java.util.Scanner;

public class week1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();   
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i]; 
        }
        Arrays.sort(arr);
        int min =arr[0];
        int max = arr[arr.length-1];

        int min1=sum-max;
        int max1=sum-min;

        System.out.println(min1+" "+max1);
        
    }
    
}
