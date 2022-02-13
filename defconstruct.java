public class defconstruct {
    int x;
    String b;

    defconstruct() {
        // while object are ceated the automatic called
        System.out.print("hey this is default" + x);
    }

    void display() {
        System.out.print("hey this is without constructer" + x + " " + b);
    }

    public static void main(String[] args) {
        defconstruct mk = new defconstruct();
        mk.display();
    }
}
