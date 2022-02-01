public class recursion_test {

    static int fib(int n) {
        /*
         * if(n==1){
         * return 0;
         * }
         * else if(n==2){
         * return 1;
         * }
         */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {

        // Problem 4
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        int result = fib(7);
        System.out.println(result);

    }
}
