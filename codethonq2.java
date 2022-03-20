public class codethonq2 {
    public static void main(String[] args) {
        // Write a Program to Calculate Average Using Arrays
        int arr[]={2,4,6,7,5,6,5,5,3,7};
        int avg=0;
        for(int i=0; i<arr.length;i++){
            avg=avg+arr[i];
        }
        int sum = avg/arr.length;
        System.out.println("sum of Array Data is: - "+avg+ "  and Avg of number is "+sum);
    }
}
