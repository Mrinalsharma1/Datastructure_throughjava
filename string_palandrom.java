public class string_palandrom {
    public static void main(String[] args) {
        String str = "M";
        int len = str.length();
        int flag = 0;
        for (int i = 0, j = len - 1; i <= len / 2; i++, j--) {
            flag = 0;
            if (str.charAt(i) == str.charAt(j)) {
                flag = 1;
            }
        }
        if (flag > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
