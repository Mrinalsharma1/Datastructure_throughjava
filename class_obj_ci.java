import java.util.Scanner;

class demo{
    int a,b,sum;
    float avg;
    demo(){
        this.a=0;
        this.b=0;
        this.sum=0;
        this.avg=0;
    }
    void get_data(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Value");
        a=sc.nextInt();
        System.out.println("Enter Second value");
        b=sc.nextInt();
    }
    void sum_avg(){
        sum=a+b;
        avg=(a+b)/2;
    }
    void Display(){
        System.out.println("sum of two number is :"+sum);
        System.out.println("Avrage of two number is :"+avg);
    }
}
public class class_obj_ci {
   public static void main(String[] args) {
       demo obj = new demo();
       obj.get_data();
       obj.sum_avg();
       obj.Display();
   } 
}
