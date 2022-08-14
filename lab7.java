class multi extends Thread {
    public void run() {
        try {
            System.out.println("threads:" + Thread.currentThread().getId());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}

public class lab7 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            multi obj = new multi();
            obj.start();
        }

    }
}
