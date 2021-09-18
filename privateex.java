class data {
    int a = 22;
    private int x = 10;

    private void abc() {
        System.out.print("this is private class");
    }
}

public class privateex {
    public static void main(String[] args) {
        data mk = new data();
        System.out.print("a is : " + mk.a);
        // mk.abc();
        // System.out.print("a is : " + mk.a);
    }
}
