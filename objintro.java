import java.util.Scanner;

public class objintro {
    int n = 1;

    void creat() {
        // Scanner mrinal = new mrinal(String.in);
        System.out.print("this is creat page \n");
    }

    int update(int m, int n) {
        System.out.print("this is Update page \n");
        return (m + n);
    }

    void delet(int a, int x, int z) {
        int sum = a + x;
        System.out.print("pass by value" + sum + "\n");
        System.out.print("pass by value" + z + "\n");
        System.out.print("this is Delet page \n");
        // static class nested1 {
        // void delete1() {
        // System.out.print("pass by value" + (sum + 5) + "\n");
        // }
        // }

    }

    public static void main(String[] args) {

        objintro mk = new objintro();
        mk.creat();
        int abc = mk.update(3, 7);
        mk.delet(1, 4, abc);
        System.out.print("return from update" + abc);
        // delete.nested1 mk1 = new delete.nested1();
        // mk1.delete1();
    }
}
