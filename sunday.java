public class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
    public String toString() {
        return name;
    }

}
class Employeee extends Person {
    double annualSalary;
    int yearOfJoining;
    String nationalInsuranceNo;

    public Employeee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNo) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearOfJoining = yearOfJoining;
        this.nationalInsuranceNo = nationalInsuranceNo;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public String getNationalInsuranceNo() {
        return nationalInsuranceNo;
    }

    public String getName() {
        return name;
    }

   
    public String toString() {
        return "Employee [Annual Salary= " + annualSalary + ", Year Of Joining=" + yearOfJoining + ", National Insurance No="
                + nationalInsuranceNo + ", Name=" + name + "]";
    }


}
public class sunday {
    public static void main(String[] args) {
        Employeee employee = new Employeee("Adarsh Rajput", 5000000, 2022, "321a2sd1321ad");
        System.out.println(employee);
    }
}
