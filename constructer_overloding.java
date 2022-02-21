import java.util.Scanner;

class demo{
    int x,y;
    demo(int a,int b){
        this.x = a;
        this.y =b;
    }
    void display(){
        System.out.println("demo first value is :"+x);
        System.out.println("demo Second value is :"+y);
    }

}
class abc extends demo{
    abc(int a,int b){
        super(a,b);
    }
    
}
public class constructer_overloding {
    public static void main(String[] args) {
        demo obj = new demo(5 ,6);
        obj.display();
        abc obj1 = new abc(3,8);
        obj1.display();
    }
}
