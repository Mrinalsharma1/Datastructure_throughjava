import java.util.Scanner;

public class week1Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number");
        int n=sc.nextInt();
        int arr[][] = new int[n][n];
        int x,j,y;
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            x=i;
            y=n-1-i;
            // System.out.println("number is"+y);
            for(j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                if(x==j){
                    sum1 +=arr[x][j];
                }
                if(y==j){
                    sum2+=arr[x][y];
                    // System.out.println(arr[x][y]);
                }
            }
        }
        
        // System.out.println("sum of diagonal first is "+sum1);
        // System.out.println("sum of diagonal second is "+sum2);
        int temp = sum1-sum2;
        int value = Math.abs(temp);
        System.out.println(value);

    }
    
}
