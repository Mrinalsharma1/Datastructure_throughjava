class printer {
    // synchronized void printDocuments(int nofcopy, String docName) {
    void printDocuments(int nofcopy, String docName) {
        for (int i = 0; i <= nofcopy; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            System.out.println(">>Printing " + docName + " " + i);
        }
    }
}

class MyThreds extends Thread {
    printer pref;

    MyThreds(printer p) {
        pref = p;
    }

    @Override
    public void run() {
        synchronized (pref) {
            pref.printDocuments(5, "Mrinalprofile.docs");
        }
        // pref.printDocuments(5, "Mrinalprofile.docs");
    }
}

class Yourthreds extends Thread {
    printer yref;

    Yourthreds(printer p) {
        yref = p;
    }

    @Override
    public void run() {
        synchronized (yref) {
            yref.printDocuments(5, "Sagarprofiles.xls");
        }
        // yref.printDocuments(5, "Sagarprofiles.xls");
    }
}

public class multiplethreds {
    public static void main(String[] args) {
        System.out.println("== Application Start ==");

        printer abc = new printer();
        // abc.printDocuments(10, "ishantprofile.pdf");
        MyThreds mref = new MyThreds(abc);
        Yourthreds yref = new Yourthreds(abc);
        mref.start();
        // yref.start();
        // try {
        // mref.join();
        // } catch (Exception e) {
        // // TODO: handle exception
        // System.out.println(e);
        // } if you used synconrise keyword in class same work will be done.
        yref.start();

        System.out.println("== Application Close ==");
    }
}
