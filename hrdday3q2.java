import java.util.Scanner;
import java.util.Arrays;

public class hrdday3q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = str.length();
        char temp[]= new char[n];
        char[] arr2 = Arrays.copyOf(temp, 10);
        // HashSet<Character> map = new HashSet<Character>();
        char ch[]= str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=str.length()-i;j>0;j--){
                arr2[str.length()+1] = temp[j];
            }
        }
        for(char x : arr2){
            System.out.println(x);
        }
        // for(int i=0, j=str.length()-1;i!=j;i++,j--){
        //     if(ch[i]!=ch[j])
        //     {
        //         temp[i]=ch[i];
        //     }
        // }
       
    }
}
