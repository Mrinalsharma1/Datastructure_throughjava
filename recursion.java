public class recursion {
    static int fact(int a) {
        int x = a;
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("factorial of number is " + fact(n));
    }
}