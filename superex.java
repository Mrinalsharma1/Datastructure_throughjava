class person {
    int id;
    String name;
    final String org = "TCS";

    person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class emp extends person {
    float salary;

    emp(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    void heading() {
        System.out.println("id  name salary organication");
    }

    void display() {
        System.out.println(id + "  " + name + "  " + salary + "    " + org);
    }

}

public class superex {
    public static void main(String[] args) {

        emp mk = new emp(11, "mrinal", 23.0f);
        emp mk1 = new emp(12, "sagar", 25.0f);
        mk.heading();
        mk.display();
        mk1.display();
    }

}