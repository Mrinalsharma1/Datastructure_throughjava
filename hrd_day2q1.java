import java.util.Scanner;

public class hrd_day2q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "rahu23ul";
        int count=0;
        for(int i=0;i<str.length();i++){
            // char ch = str.charAt(i);
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57){
                count++;
            }
        }
        System.out.println(count);
    }
}
