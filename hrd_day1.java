public class hrd_day1 {
    public static void main(String[] args) {
        char n ='4';
        String str = "443475";
        int count=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c != n){
                count++;
            }
        }
        System.out.println(count);
    }
}
