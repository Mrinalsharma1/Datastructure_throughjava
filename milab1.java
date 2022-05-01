interface first{
    void eat();
}
interface second{
    void sleep();
}
class xyz implements first, second{
    @Override
    public void eat(){
        System.out.println("this is eat method");
    }
    @Override
    public void sleep() {
        System.out.println("this is sleep methods");
    }
}
public class milab1 {
    public static void main(String[] args) {
        xyz obj=new xyz();
        obj.eat();
        obj.sleep();
    }
}
