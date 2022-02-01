// import java.io.*;
// class Employee {
//     int Salary;
//     String name;

//     public int getSalary() {
//         return Salary;
//     }

//     public String getname() {
//         return name;
//     }

//     public void setname(String n) {
//         name = n;
//     }
// }

class cellphone {
    void ring() {
        System.out.println("call is ringing");
    }

    void vivrate() {
        System.out.println("phone is vivrating");
    }

    void ringing() {
        System.out.println("phone is ringing");
    }
}

public class cwh_class_ex {
    public static void main(String[] args) {
        // Create a class Employee with the following properties and methods:
        // Salary (property) (int)
        // getSalary (method returning int)
        // name (property) (String)
        // getName (method returning String)
        // setName (method changing name)

        // Employee obj = new Employee();
        // obj.setname("bouncbank");
        // obj.Salary = 656;
        // System.out.println("Name is " + obj.getname());
        // System.out.println("Salary is " + obj.getSalary());

        // Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

        cellphone abc = new cellphone();
        abc.ring();
        abc.vivrate();
        abc.ringing();

    }
}
