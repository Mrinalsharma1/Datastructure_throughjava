class demo{
    int a,b,total;
    demo(int x,int y){
        this.a=x;
        this.b=y;
        total=0;
    }
    
    int Arr[]=new int[5];
    void sum(){
        this.total = a+b;
        Arr[0]=total;
    }
    void sub(){
        this.total =a-b;
        Arr[1]=total;
    }
    void mul(){
        this.total=a*b;
        Arr[2]=total;
    }
    void div(){
        this.total=a/b;
        Arr[3]=total;
    }
    int[] back(){
        return Arr;
    }
}
public class ruturn_array {
    public static void main(String[] args) {
        demo obj = new demo(10,5);
        obj.sum();
        obj.sub();
        obj.mul();
        obj.div();
        int Arr1[] = new int[20];
        Arr1=obj.back();
        System.out.println("Sum of two Number is : "+Arr1[0]);
        System.out.println("Subtract of two Number is : "+Arr1[1]);
        System.out.println("Multipley of two Number is : "+Arr1[2]);
        System.out.println("Divide of Two Array is : "+Arr1[3]);
        
    }
}
