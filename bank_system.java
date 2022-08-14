// Q2 bank management
class bank {
    int total = 100;

    void withrawn(String name, int withamt) {
        synchronized (name) {

            if (total >= withamt) {
                System.out.println(name + "withrown" + withamt);
                total = total - withamt;
                System.out.println("balance after withdraw :" + total);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(name + "You can not withdrawn" + withamt);
                System.out.println("your balance is:" + total);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
    }

    void deposit(String name, int deposit) {
        System.out.println(name + ": Deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposite :" + total);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class bank_system {
    public static void main(String[] args) {
        bank obj = new bank();
        obj.withrawn("vikash", 10);
        obj.withrawn("sanjay", 80);
        obj.deposit("raju", 200);
        obj.withrawn("raju", 270);
    }
}
