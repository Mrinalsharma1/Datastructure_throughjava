public class firstday{
 public static void main(String[] args) {
     int a=0, b=0, sum;
     a=10;
     b=3;
     sum =a+b;
    //  System.out.println("the sum of two number is :" +sum);
    //  System.out.println("sum of " +a+ " and " +b+ " are : " +sum);
     if(sum<30){
         System.out.println("sum is less than thirty");
         if(sum<15){
             System.out.println("sum of the value is: "+sum);
         }else{
             System.out.println("number is grater than fifteen");
         }
     }else{
         System.out.println("sum of the number is "+sum);
     } 
    //  System.out.println("the sum of two number is :" +sum);
 }   
}
