class bank {
    int total = 100;

    void withrawn(String name, int withamt) {

        try{

            synchronized(name){
           
                if (total >= withamt) {
                    System.out.println(name + " withdrown " + withamt);
                    total = total - withamt;
                    System.out.println("balance after withdraw : " + total);
          
                } else {
                    System.out.println(name + " You can not withdrawn " + withamt);
                System.out.println("your balance is:" + total);
         
            }
            Thread.sleep(1000);
            }
        } 
        catch(InterruptedException e)
        {
            e.printStackTrace();
            System.out.println("Intrrupted");
        }
    }

    void deposit(String name, int deposit) {
       
        try {

            synchronized(name){

                Thread.sleep(1000);
                System.out.println(name + " : Deposited " + deposit);
                total = total + deposit;
                System.out.println("Balance after deposite : " + total);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class second {
    public static void main(String[] args) {
        bank obj = new bank();
        obj.withrawn("vikash kumar", 10);
        obj.withrawn("shibu Rana", 80);
        obj.deposit("raju", 200);
        obj.withrawn("suman", 230);
    }
}