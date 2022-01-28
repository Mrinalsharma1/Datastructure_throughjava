class abc { // super class
    int x = 10; // instance variable

    public void temp() { // instance method
        // int x;
        // x = 5;
        System.out.println("super class calling");
        // System.out.println(this.t);
        // System.out.println(super.x);

    }
}

public class super1 extends abc { // sub class
    int t = 88;

    public void num() {
        // int sum = this.t + super.x;
        // System.out.println(sum);
        System.out.println("sub class calling");
    }

    public static void main(String[] args) {
        abc obj = new super1();

        // subclass
        obj.temp();
        // obj.num();

        // obj.temp();
        // obj.num();
    }
}
