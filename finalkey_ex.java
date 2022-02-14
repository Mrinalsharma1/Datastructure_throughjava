class demo{
    void abc(){
        System.out.println("this is demo class ");
    }
}
class sila extends demo{
    // we can not access final method in inheritance
    
    void abc(){
        super.abc();
        System.out.println("this is abc class ");
    }
}
public class finalkey_ex{
    private final int x;
    private final static int y;
    static{
        y=4;
    }
    finalkey_ex(){
        x=5;
    }
    void fun(){
        final int k;
    }
    public static void main(String[] args) {
        sila abj = new sila();
        abj.abc();
    }
} 