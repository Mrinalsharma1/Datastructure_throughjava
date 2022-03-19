// public class lab {

// }
class Person {
    String p;

    Person(String p) {
        this.p = p;
    }

    void display() {
        System.out.println("Name: " + p + "\n");
    }
}

class Employee extends Person {
    double salary;
    int year;
    int insurance_number;

    Employee(double salary, int year, int insurance_number, String p) {
        super(p);
        this.salary = salary;
        this.year = year;
        this.insurance_number = insurance_number;
    }

    void display1() {
        System.out.println("Salary: " + salary + "\n");
        System.out.println("Year:" + year + "\n");
        System.out.println("Insurance Number:" + insurance_number + "\n");
    }
}

public class lab {

    public static void main(String[] args) {
        Employee emp = new Employee(250000, 2013, 20292, "Imran Gummanahalli");
        emp.display();
        emp.display1();
    }
}
