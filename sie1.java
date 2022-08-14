import java.util.Arrays;

public class sie1 {
    public static void main(String[] args) {
        // String str = "abchSghW887!&*6hdajQ";
        // StringBuffer obj = new StringBuffer("madam");
        // StringBuffer temp = new StringBuffer("abcccndjs");
        // String str = new String();
        // // System.out.println(temp.dele);
        // System.out.println(obj == temp);
        // if (obj == temp) {
        // System.out.println("string is palandrome");
        // } else {
        // System.out.println("not palandrome");
        // }
        // int alpha = 0, num = 0, spec = 0;
        // String strnew = str.toUpperCase();
        // for (int i = 0; i < strnew.length(); i++) {
        // char ch = strnew.charAt(i);
        // if (ch >= 65 && ch <= 90) {
        // alpha++;
        // } else if (ch >= 48 && ch <= 57) {
        // num++;
        // } else {
        // spec++;
        // }
        // }
        // System.out.println("Number of alphabet is : " + alpha);
        // System.out.println("Number of number is : " + num);
        // System.out.println("Number of special character is : " + spec);

        // module2
        // Q4. Write a program to find the largest 2 numbers and the smallest 2 numbers
        // in the given array using suitable control statements
        // int arr[] = { 2, 1, 3, 4, 6, 8, 9 };
        // Arrays.sort(arr);
        // for (int i = 0; i <= 1; i++) {
        // System.out.println("\t" + arr[i]);
        // }
        // for (int i = arr.length - 2; i < arr.length; i++) {
        // System.out.println("\t" + arr[i]);
        // }

        // Q6. Use string functions and write a program to merge 2 sorted arrays.

        // int arr1[] = { 1, 6, 3, 4 };
        // int arr2[] = { 5, 2, 7, 8 };
        // int arr3[] = new int[arr1.length + arr2.length];
        // for (int i = 0; i < arr1.length; i++) {
        // arr3[i] = arr1[i];
        // }
        // for (int i = arr1.length, j = 0; j < arr2.length; i++, j++) {
        // arr3[i] = arr2[j];
        // }
        // Arrays.sort(arr3);
        // System.out.println("meage array is");
        // for (int x : arr3) {
        // System.out.print(x + ",");
        // }

        // Q8 Use one dimensional array Write a program to initialize it with integer
        // values and check if a given number is present in
        // the array or not. If the number is not found, it will print -1 else it will
        // print the index value of the given number in the array

        // int arr[] = { 1, 4, 5, 9, 7 };
        // int n = 10;
        // int flag = 0;
        // int r = -1;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == n) {
        // System.out.println(arr[i]);
        // flag = 1;
        // }
        // }
        // if (flag == 0)
        // System.out.println(r);

        // Q9
        String str = new String("madam");

        StringBuffer obj = new StringBuffer(str);

        if (str.compareTo(obj.reverse().toString()) == 0) {
            System.out.println("string is palandrome");
        } else {
            System.out.println("not palandrome");
        }

        // Q10 Illustrate Recursion by writing a program to the print Fibonacci series
    }
}
