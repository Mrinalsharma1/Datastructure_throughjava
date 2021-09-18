import java.util.Scanner;

public class passobjasarg {
    int age;
    String name;

    passobjasarg() {

    }

    passobjasarg(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public passobjasarg copyobj(passobjasarg obj) {
        this.name = obj.name;
        this.age = obj.age;
        return obj;
    }

    void displaydata() {
        System.out.print("Your name is: " + name + "\n");
        System.out.print("Your age is: " + age + "\n");
    }

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        System.out.print("enter Your age");
        int age = mk.nextInt();
        System.out.print("enter Your name");
        String name = mk.next();
        passobjasarg obj = new passobjasarg(age, name);
        System.out.print("Content of original Object \n");
        obj.displaydata();
        System.out.println("Contents of the copied object \n");
        passobjasarg copyOfStd = new passobjasarg().copyobj(obj);
        copyOfStd.displaydata();

    }
}
