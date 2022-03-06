public class firstday{
 public static void main(String[] args) {
    int l =Integer.parseInt(args[0]);
    if(l>0){
        float si,p,r,t;
        p=Float.parseFloat(args[0]);
        r=Float.parseFloat(args[1]);
        t=Float.parseFloat(args[2]);
        si=p*r*t/100;
        System.out.println("simple intrest is "+si);
    }else{
        System.out.println("pass variable from command line");
    }
 }   
}
