class counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class syncro {
    public static void main(String[] args) throws Exception {
        counter obj = new counter();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    obj.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    obj.increment();
                }
            }
        });
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("count :" + obj.count);

    }
}
