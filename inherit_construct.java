class parents {
    parents() {
        System.out.println("this is parents or super class");
    }

    parents(int x) {
        System.out.println("this is overloded parents class " + x);
    }

    void sum() {
        System.out.println("sum of number");
    }
}

class child extends parents {
    child() {
        super(7);
        System.out.println("this is child or  sub class");
    }

    static void abc1() {
        child temp = new child();
        temp.sum();
    }
}

public class inherit_construct {
    public static void main(String[] args) {
        child abc = new child();
        // abc.abc1();
    }
}
