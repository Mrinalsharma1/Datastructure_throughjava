public class recursion {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void fact(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fact(count - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("0" + " 1");
        // System.out.println("1");
        fact(n - 2);
    }
}