public class natural {

    static int CheckPrime(int i, int num) {
        if (num == i)
            return 0;
        else if (num % i == 0)
            return 1;
        else {
            return CheckPrime(i + 1, num);
        }
    }

    static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return (n * fact(n - 1));
    }

    public static void main(String[] args) {
        int n = 5;
        // int i, num = 0, sum = 0;
        // String primenum = " ";
        // for (i = 1; i <= n; i++) {
        // int count = 0;
        // for (num = i; num >= 1; num--) {
        // if (i % num == 0) {
        // count += 1;
        // }
        // }
        // if (count == 2) {
        // primenum += i + " ";
        // sum += i;
        // }
        // }
        // System.out.println(primenum);
        // System.out.println("sum of 1 to 100 prime number is : " + sum);
        // System.out.println("\n" + natural_sum(n));

        // for (int i = 2; i <= n; i++)
        // if (CheckPrime(2, i) == 0)
        // System.out.print(i + " ");
        System.out.println(fact(n));
    }
}
