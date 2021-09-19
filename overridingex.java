class bank {
    int getRateOfInterest() {
        return 0;
    }
}

class sbi extends bank {
    int getRateOfInterest() {
        return 8;
    }
}

class icici extends bank {
    int getRateOfInterest() {
        return 7;
    }
}

class axix extends bank {
    int getRateOfInterest() {
        return 9;
    }
}

public class overridingex {
    public static void main(String[] args) {
        // This example is also given in method overriding but there was no upcasting.
        // bank mk;
        // mk = new sbi();
        // mk = new icici();
        // mk = new axix();

        sbi mk = new sbi();
        icici mk1 = new icici();
        axix mk2 = new axix();

        System.out.println("sbi intrest rate is : " + mk.getRateOfInterest());
        System.out.println("icici intrest rate is : " + mk1.getRateOfInterest());// mk.getRateOfIntrest();
        System.out.println("axix intrest rate is : " + mk1.getRateOfInterest());// mk.getRateOfIntrest();
    }
}
