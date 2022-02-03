class parents {
    parents() {
        System.out.println("this is parents or super class");
    }

    parents(int x) {
        System.out.println("this is overloded parents class " + x);
    }
}

class child extends parents {
    child() {
        super(7);
        System.out.println("this is child or  sub class");
    }
}

public class inherit_construct {
    public static void main(String[] args) {
        child abc = new child();
    }
}
