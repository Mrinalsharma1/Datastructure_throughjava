import java.util.*;
class codehrd1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] string = str.split("");
        int arr[] = new int[string.length];
        int arr1[]=new int[3];
        int arr2[]=new int[3];
        int sum[]=new int[3];
        for(int i=0;i<string.length;i++){
            if(i<3){
                arr1[i]=arr[i];
            }else{
                arr2[i]=arr[i];
            }
        }
        for(int i=0;i<3;i++){
            sum[i]=arr1[i]-arr2[i];
        }
        int max = Arrays.stream(sum).max().getAsInt();
        System.out.println(max);
        
        
    }
}
