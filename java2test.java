import java.util.Scanner;

public class java2test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Angle");
        double x = sc.nextDouble();
        System.out.println("Enter second Angle");
        double y = sc.nextDouble();
        System.out.println("Enter third Angle");
        double z = sc.nextDouble();
        double d = y*y-4.0*x*z;
        if(d>0.0){
            double r1=(-y+Math.pow(d, 0.5))/(2.0*x);
            double r2=(y+Math.pow(d, 0.5))/(2.0*x);
            System.out.println("The roots are " + r1 + " and " + r2);  
        }else if(d == 0.0){
            double r1 = -y / (2.0 * x);  
            System.out.println("The root is " + r1);  
        }else{
            System.out.println("Roots are not equalls");
        }

    }
}
