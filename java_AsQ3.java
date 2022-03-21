import java.util.Scanner;

public class java_AsQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of First Array");
        int n1 = sc.nextInt();
        System.out.println("Enter The Size of Second Array");
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        int arr3[] = new int[n1+n2];

        System.out.println("Enter the Sorted Array Elements : -");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
            arr3[i]=arr1[i];
        }
        int k = n1;
        System.out.println("Enter the Sorted Array Elements : -");
        for(int i=0;i<n1;i++){
            arr2[i]=sc.nextInt();
            arr3[k]=arr2[i];
            k++;
        }
        System.out.println("The Merge Array is :- ");
        for(int i=0;i<(n1+n2);i++){
            System.out.print("\t " +arr3[i]);
        }

        // System.out.println("\n After Sorting :- ");
        for(int i =0; i<(n1+n2); i++){
            int temp;
            for(int j=i+1; j<(n1+n2);j++){
                if(arr3[i]<arr3[j]){
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        System.out.println("\n ******* Sorted Array is **********");
        for(int i=0;i<(n1+n2);i++){
            System.out.print("\t " +arr3[i]);
        }
        System.out.println("\n");
    }
}
