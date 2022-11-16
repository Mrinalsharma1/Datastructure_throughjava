import java.util.Arrays;

public class Anagram1 {
    static boolean isAnagram(String x, String y) {
        x = x.replace(" ", "").toLowerCase();
        y = y.replace(" ", "").toLowerCase();

        char[] a = x.toCharArray();
        char[] b = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        boolean x = Anagram1.isAnagram("A BC", "BCAS");
        System.out.println((x) ? "Anagram" : "Not Anagram");
    }
}
