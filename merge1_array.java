public class merge1_array {
    public static void main(String[] args) {
        int arr[]={3,2,1,7};
        int arr1[]={8,4,9,5};
        
        int sum = arr.length+arr1.length;
        int temp [] = new int[sum];
     
   
        for(int i=0; i<arr.length; i++){
            temp[i]=arr[i];
   
        }
      
       for(int i=arr.length, j=0; i<sum; i++ , j++){

            temp[i]=arr1[j];
         
        }

        for(int i=0; i<temp.length; i++)
        {
            System.out.println(temp[i]);
        }
     
    }
}
