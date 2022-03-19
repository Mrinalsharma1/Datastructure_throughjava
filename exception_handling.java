import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number ");
        String abc = sc.next();
        int arr[] = {22,44,55,33,55,33,22,11,55};
        String str = null;

        try{
            int data = 100/0;

        }catch(ArithmeticException ex){
            System.err.println("\n Arthmatic excepction happened \n");
            System.out.println(ex);
        }try{
            int a = Integer.parseInt(abc);
            System.out.println(" The  Number you Entered is "+a+"\n");
        }
        catch(NumberFormatException ex1){
            System.out.println("\n number is not string \n");
            System.err.println(ex1);
        }
        try{
            System.out.println(arr[9]);
        }catch(ArrayIndexOutOfBoundsException ex2){
            System.out.println(ex2);
        }
        try{
            System.out.println(arr[9]);
        }catch(ArrayIndexOutOfBoundsException ex2){
            System.out.println(ex2);
        }
        try{
            System.out.println(str.length());
        }catch(NullPointerException ex2){
            System.out.println(ex2);
        }
    }
}
