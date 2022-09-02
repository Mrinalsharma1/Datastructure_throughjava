public class String_Tokens {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String str = "He is a very very good boy, isn't he?";
        int count = 0, j = 0;
        String temp = "";
        int len = str.length();
        // System.out.println(len);
        String Arr[] = new String[len];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // System.out.print(ch - 0);
            if (ch != ' ') {
                temp = temp + ch;
            } else if (ch - 0 == 39) {
                // System.out.print(temp);
                Arr[j] = temp;
                j++;
                count++;
                temp = "";
            } else {
                Arr[j] = temp;
                j++;
                count++;
                temp = "";
            }
        }
        Arr[j] = temp;
        count++;
        System.out.println(count + 1);
        // System.out.println(Arr.length);
        for (int i = 0; i < count; i++) {
            System.out.println(Arr[i]);
        }
    }
}