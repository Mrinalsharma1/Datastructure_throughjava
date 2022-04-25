public class hrdq2 {
    public static void main(String[] args) {
        String str = "helloworld";
        // String num ="";
        int count=0;
        // boolean istrue=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            for(int j=0;j<str.length();j++){
                char t =str.charAt(j);
                // System.out.print(t+"\t");
                
                    if(ch == t){
                        // System.out.println(t);
                        count++;
                    
                }
            }
            // if(istrue==true){
            //     count++;
            // }
        }
        System.out.println(count);
    }
}
