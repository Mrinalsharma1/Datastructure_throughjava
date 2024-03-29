abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class abstrex {
    public static void main(String args[]) {
        Bank b = new SBI();// if object is PNB, method of PNB will be invoked
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        Bank b1 = new PNB();
        System.out.println("Rate of Interest is: " + b1.getRateOfInterest() + " %");

    }
}
