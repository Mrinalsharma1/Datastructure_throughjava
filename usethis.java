public class usethis {
    int id;
    int age;
    String name;

    usethis(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("details is :-  " + id + " " + age + " " + name);
    }

    public static void main(String[] args) {
        usethis mk = new usethis(01, 23, "mrinal");
        usethis mk1 = new usethis(02, 24, "sohan");
        mk.display();
        System.out.print("\n");
        mk1.display();
        // garvage collector method apply
        mk = null;
        System.out.print(mk);

    }
}
