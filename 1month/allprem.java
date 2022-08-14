// import java.util.*;

// class allprem {

//     static void permute(String s, String answer) {
//         if (s.length() == 0) {
//             System.out.print(answer + " ");
//             return;
//         }

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             String left_substr = s.substring(0, i);
//             String right_substr = s.substring(i + 1);
//             String rest = left_substr + right_substr;
//             permute(rest, answer + ch);
//         }
//     }

//     // Driver code
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);

//         String s;
//         String answer = "";

//         System.out.print("Enter the string : ");
//         s = scan.next();

//         System.out.print("\nAll possible strings are : ");
//         permute(s, answer);
//     }
// }

// // This code is contributed by adityapande88

import java.util.Scanner;

public class allprem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double d = 234.12413;
        //
        int length;
        length = strlen(number);
        while (length--) {
            if (number[length] == '.') {
                flag = 1;
                break;
            }
        }

        // 25672System.err.println(result);
        // input.close();

        // if (Math.abs(n1 - n2) <= 0.01) {
        // System.out.println("They are the same");
        // } else {
        // System.out.println("They are different");
        // }
    }
}