public class java1test {
    public static void main(String[] args) {
        String gender =args[0];
        int age=Integer.parseInt(args[1]);
        if(args.length == 0){
            System.out.println("No Arguments");
        }else{
            if(gender=="femal"){
                if(age>=1 && age<58){
                    System.out.println("intrest rate is= 8.2%");
                }else if(age>58 && age<102){
                    System.out.println("intrest rate is= 7.6%");
                }else{
                    System.out.println("No result");
                }
            }else{
                if(age>=1 && age<=58){
                    System.out.println("intrest rate is= 9.2%");
                }else if(age>58 && age<=100){
                    System.out.println("intrest rate is= 8.3%");
                }else{
                    System.out.println("No Result");
                }
            }
        }

    }
}
