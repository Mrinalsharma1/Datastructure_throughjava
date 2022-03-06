abstract class demo{
    abstract void poweron();
    abstract void powerof();
    static void self(){
        System.out.println("hello abstract class");
    }
}
// abstract class demo1{
//     abstract void ten();
// }
abstract class xyz extends demo{
    void powerof(){
        System.out.println("realme on kro");
    }
    void poweron(){
        System.out.println("realme of kro");
    }
    abstract void play();
    abstract void music();

}
class abc extends xyz{
    void play(){
        System.out.println("play songs");
    }
    void music(){
        System.out.println("music hip hop");
    }
}
public class Abstract_ex{
    public static void main(String[] args) {
        // demo obj1 = new demo();
        // xyz obj = new xyz();
        // obj.self();
        // obj.powerof();
        // obj.poweron();
        abc obj2 = new abc();
        abc.self();
        obj2.play();
        obj2.music();
    }
}