class demo<T> {
    T a;

    void get(T x) {
        this.a = x;
    }

    T show() {
        return a;
    }

}

public class generic1 {
    public static void main(String[] args) {
        demo<Integer> obj = new <Integer>demo();
        demo<String> obj1 = new <String>demo();
        obj.get(5);
        System.out.println("value is :" + obj.show());
        obj1.get("sagar");
        System.out.println("value is :" + obj1.show());

    }
}
