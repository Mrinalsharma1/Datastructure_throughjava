import java.util.Scanner;

public class java_AsQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Searching Element :- ");
        int n = sc.nextInt();
        int index=0;
        int notf=-1;
        int arr[]={2,3,5,8,1,9,33,56};
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                index=i;
            }
        }
        if(index>0){
            System.out.println("Your Searching Element Found In Index Number :- "+index);
        }else{
            System.out.println("Number Is Not Found : "+notf);
        }
        
    }
}
