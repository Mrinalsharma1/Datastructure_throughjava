class abc {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

public class likitaQ3 {
    public static void main(String[] args) {
        String str = "geeks";
        str = str.toLowerCase();
        if (isPalindrome(str))