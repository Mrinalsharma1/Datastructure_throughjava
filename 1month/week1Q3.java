import java.util.Scanner;

public class week1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp;
        String x = "00";
        // System.out.println(str.substring(8,10));
        if(str.substring(8,10).equals("PM")){
            if(str.substring(0,2).equals("12")){
                System.out.println(str.substring(0, 8));
            
            }else{
                temp=str.substring(0,2);
                int temp1=12+Integer.parseInt(temp);
                System.out.println(temp1+""+str.substring(2,8));
            }

        }else if(str.substring(8,10).equals("AM")){
            if(str.substring(0,2).equals("12")){
                // temp=str.substring(0,2);
                // int temp1=12+Integer.parseInt(temp);
                // System.out.println(temp1+""+str.substring(2,8));
                System.out.println(x.concat(str.substring(2, 8)));
            }else{
                temp=str.substring(0,2);
                // System.out.println(temp);
                // int temp1=Integer.parseInt(temp);
                System.out.println(temp+""+str.substring(2,8));
            }
            
        }
    }
    
}
