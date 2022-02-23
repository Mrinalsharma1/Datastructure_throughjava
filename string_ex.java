public class string_ex {
    public static void main(String[] args) {

        String name ="Javascriptg"; // get value from string
        char ch = name.charAt(9);
        System.out.println("character is : "+ch);

        String s1 ="javatpoint"; 
        System.out.println("length is "+s1.length());

        String s2 ="  hello java string   ";    
        String tr = s2.trim(); 
        System.out.println(""+tr);

        // harry day
        String s3 ="JAVATPOINT HELLO stRIng";  
        String slower =s3.toLowerCase();  
        System.out.println(""+slower); 
        
        String s4 ="JAVATPOINT HELLO stRIng";  
        String s1lower=s4.toLowerCase();  
        System.out.println(s1lower); 
        
        
    }
}
