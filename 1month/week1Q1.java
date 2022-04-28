import java.util.Scanner;

public class week1Q1 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter number");
       int n=sc.nextInt();
       float arr[]=new float[n];
       float neg=0;
       float pos=0;
       float zero=0;
    //    System.out.println("Enter value");
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
           if(arr[i]<0){
                neg++;
           }else if(arr[i]>0){
                pos++;
           }else{
                zero++;
           }
       }
       System.out.println(neg);
       System.out.println(pos);
       System.out.println(zero);
       System.out.printf("\n%.6f",pos/n);
       System.out.printf("%.6f",neg/n);
       System.out.printf("\n%.6f",zero/n);
       
   } 
}
