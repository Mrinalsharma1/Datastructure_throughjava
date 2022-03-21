import java.util.Scanner;

class abc {
    int length, breadth;

    public void setDim(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int getArea() {

        return length * breadth;
    }
}

public class sahanaq1 {
    public static void main(String[] args) {
        abc x = new abc();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int y = sc.nextInt();
        System.out.println("enter breath");
        int z = sc.nextInt();
       
        x.setDim(y, z);
        int a = x.getArea();
        System.out.println("Area =" + a);
    }
}