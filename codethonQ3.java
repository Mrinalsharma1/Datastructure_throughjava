public class codethonQ3 {
    public static void main(String[] args) {
        int Arr1[]={3,4,5,6};
        int Arr2[]={4,3,5,6};
        int l1=Arr1.length;
        int l2=Arr2.length;
        int count =0;
        int arr3[] =new int[l1+l2];
        for(int i=0;i<l1;i++){
            arr3[i]=Arr1[i];
            count++;
        }
        for(int j=0;j<l2;j++){
            arr3[count++]=Arr2[j];
        }
        for(int value :arr3){
            System.out.println(" "+value);
        }
    }
}
