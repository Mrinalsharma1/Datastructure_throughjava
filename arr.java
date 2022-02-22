import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        int arr1[][]=new int [3][3];
        int arr2[][]= new int [3][3];
        int sum[][]=new int[3][3];
        int row=0,col=0,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many row & column you want to create");
        row =sc.nextInt();
        col=sc.nextInt();
        System.out.println("Enter first matrix elements");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Second matrix elements");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Adding matrix1 and Matrix2");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Display the Sum of two Matrix");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print("\t"+sum[i][j]);
            }
            System.out.println(" ");
        }

    }
}
