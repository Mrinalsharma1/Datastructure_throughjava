public class overlconst {
    int id, age;
    String name;

    overlconst(int i, String n) {
        id = i;
        name = n;
    }

    overlconst(int i, int a, String n) {
        id = i;
        name = n;
        age = a;

    }

    void display() {
        System.out.println("this is an example of overloded constructor \n");
        System.out.print(id + " " + name + " " + age);

    }

    public static void main(String[] args) {
        overlconst mk = new overlconst(5, "mukesh");
        overlconst mk1 = new overlconst(6, 23, "sahalni");
        mk.display();
        System.out.print("\n");
        mk1.display();
    }
}
