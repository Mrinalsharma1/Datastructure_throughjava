class abc {
    boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    void isPalindrome_build(String str){
        String input = str;
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input.equals(input1));
    }
}

public class likitaQ3 {
    public static void main(String[] args) {
        abc obj = new abc();
        String str = "RACEcar";
        str = str.toLowerCase();
        if (obj.isPalindrome(str)){
            System.out.println("\n String Is Palindrome");
        }
        else{
            System.out.println("\n String Is Not Paliindrome");
        }
        obj.isPalindrome_build(str);
        // if (){
        //     System.out.println("\n String Is Palindrome");
        // }
        // else{
        //     System.out.println("\n String Is Not Paliindrome");
        // }
    }

}
