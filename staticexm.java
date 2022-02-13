public class staticexm {
    int id;
    String name;
    static String college = "VTU";

    staticexm(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.print("Students Details:-" + id + " " + name + " " + college);
    }

    public static void main(String[] args) {
        staticexm mk = new staticexm(101, "sagar");
        staticexm mk1 = new staticexm(102, "mrinal");
        mk.display();
        System.out.print("\n");
        mk1.display();
    }
}
