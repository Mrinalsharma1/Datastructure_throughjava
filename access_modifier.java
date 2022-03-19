class A{
    private int data;
    // getter methods
    public int getdata(){
        return this.data;
    }
    // setter methods
    public void setdata(int abc){
        this.data = abc;
    }
    protected void students(){
        System.out.println("This is protected ");
    }
}

// class Abc extends A{
//     void take(){
//         System.out.println("hello");
//         A obj1 = new A();
//         obj1.setdata(10);
//     }
// }
public class access_modifier {
    public static void main(String[] args) {
        A obj = new A();
        obj.students();
        // obj.take();
        obj.setdata(10);
        System.out.println("Value is: "+obj.getdata());


        
    }
}
