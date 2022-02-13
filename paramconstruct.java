public class paramconstruct {
    int id;
    String name;

    paramconstruct(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.print("this is a example of paramatrized constructor \n");
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        paramconstruct mk = new paramconstruct(111, "mukesh");
        paramconstruct mk1 = new paramconstruct(112, "mahi");
        mk.display();
        mk1.display();
    }
}
