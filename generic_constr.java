class employee {
    String data;

    public <T> employee(T data) {
        this.data = data.toString();
    }

    public void test() {
        System.out.println("value :" + this.data);
    }
}

public class generic_constr {
    public static void main(String[] args) {
        employee emp = new employee("raju");
        emp.test();
        employee emp1 = new employee(22323);
        emp1.test();
        employee emp2 = new employee(22323.0f);
        emp2.test();
    }
}

// this is second method to declare constructor
// class employee<T> {
// T data;

// employee(T data) {
// this.data = data;
// }

// public void test() {
// System.out.println("value :" + this.data);
// }
// }

// public class generic_constr {
// public static void main(String[] args) {
// employee<String> emp = new employee<String>("raju");
// emp.test();
// employee<Integer> emp1 = new employee<Integer>(22323);
// emp1.test();
// employee<Float> emp2 = new employee<Float>(22323.0f);
// emp2.test();
// }
// }
