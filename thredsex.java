// class printer {
//     void updt() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Number is:" + i + " printer2");
//         }
//     }
// }
class ca {

}

class printer extends ca implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number is:" + i + " printer2");
        }
    }
}

public class thredsex {
    public static void main(String[] args) {
        System.out.println("system is ONN");
        // printer mk = new printer();
        // mk.start();
        Runnable r = new printer();
        Thread mk = new Thread(r);
        mk.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Number is:" + i + " printer1");
        }
        System.out.println("system id OFF");
    }
}
