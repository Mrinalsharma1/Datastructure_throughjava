import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class zensarstr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "HelloWorld";
        char arr[] = str.toCharArray();
        // String abc = "";
        // char temp[] = abc.toCharArray();
        StringBuffer a = new StringBuffer(str.length());
        StringBuffer r = new StringBuffer(str.length());
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != '0') {
                    count++;
                    arr[j] = '0';
                }
            }
            if (count > 1 && arr[i] != '0') {
                r = r.append(arr[i]);
            }
            if (count == 1 && arr[i] != '0') {
                a = a.append(arr[i]);
            }
        }
        String t = r.toString();
        char temp[] = t.toCharArray();
        Arrays.sort(temp);
        for (char x : temp)
            System.out.print(x);
        System.out.print(a);
    }

}
