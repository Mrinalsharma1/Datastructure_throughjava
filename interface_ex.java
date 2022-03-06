interface test{
    void students();
    void marks();
    static void ddd(){
        System.out.println("hello ddd");
    }
}
interface test2{
    void students2();
    void marks2();
    static void ddd(){
        System.out.println("hello ddd");
    }
}
class check1{
    void right(){
        
    }
    void wrong(){

    }
}
class check extends check1 implements test,test2{
    public void students(){
        
        System.out.println("students prototype");
    }
    public void marks(){
        System.out.println("marks prototype");
    }
    public void students2(){
        
        System.out.println("students prototype");
    }
    public void marks2(){
        System.out.println("marks prototype");
    }
} 
public class interface_ex {
    public static void main(String[] args) {
    //  test obj = new test();   
    check obj = new check();
    test.ddd();
    obj.students();
    obj.marks();
    }
}
