import java.util.Scanner;

interface Area{
    void AreaOf();
}
class AreaOfRectangle implements Area{
    float area;
    AreaOfRectangle(){
        area = 0;
    }
    public void AreaOf(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        float l = sc.nextFloat();
        System.out.print("Enter breadth: ");
        float b = sc.nextFloat();
        area = l*b;
    }
    void showArea(){
        System.out.println("Area of Rectangle is : "+area);
    }

}
class Trangle1 implements Area{
    float area;
    Trangle1(){
        area = 0;
    }
    public void AreaOf(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter breadth: ");
        float b = sc.nextFloat();
        System.out.print("Enter height: ");
        float h = sc.nextFloat();
        area = (b*h)/2;  
        
    }
    void showArea(){
        System.out.println("Area of Trangle is : "+area);
    }
}
public class muttiple_inheritance {
    public static void main(String[] args) {
       AreaOfRectangle obj1 = new AreaOfRectangle();
       Trangle1 obj2 = new Trangle1();

        System.out.println("\t########## Trangle Soluction ##############");

        System.out.println(obj1.area);
        obj1.AreaOf();
        obj1.showArea();
        obj2.AreaOf();
        obj2.showArea();
    }
}
