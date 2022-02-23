class bubble{
    void bubble_sort(){
        int arr[] ={3,5,8,5,3,8,9};
        int l = arr.length;
        // int loop = 1;
        // int arr1[] = new int[l+1];
        int i=0;
        System.out.println("before bobble sort");
        for(i =0; i<l;i++){
            System.out.print("\t"+arr[i]);
        }
        System.out.println("\n");
        for(i =0;i<l;i++){
            for(int j =1;j<(l-i);j++){
                // System.out.println(loop++);
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("after bobble sort");
        for(i =0; i<l;i++){
            System.out.print("\t"+arr[i]);
        }
        System.out.println("\n");
    }
}
public class bubble_sort1 {
 public static void main(String[] args) {
     bubble obj = new bubble();
     obj.bubble_sort();
     
 }   
}
