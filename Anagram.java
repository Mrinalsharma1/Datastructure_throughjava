import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String st = "anagramm";
        String st1 = "marganaa";
        st = st.toLowerCase();
        st1 = st1.toLowerCase();
        char ch[] = st.toCharArray();
        char ch1[] = st1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        st = String.valueOf(ch);
        st1 = String.valueOf(ch1);
        System.out.println(st + "  " + st1);
        if (st1.equals(st))
            System.out.println("Anagrams");
        else
            System.err.println("Not Anagrams");
    }
}