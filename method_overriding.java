class demo{
    void abc(){
        System.out.println("this is parents class");
    }
}
class demo1 extends demo{
    @Override
    void abc(){
        System.out.println("this is child class");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        demo1 mk = new demo1(); 
        demo mk1 = new demo();
        mk1.abc();
        mk.abc();
    }
}
