interface x {
    void cricket();
}

interface y {
    void footbal();
}

class check1 implements x, y {
    public void cricket() {
        System.out.println("hello cricket");
    }

    public void footbal() {
        System.out.println("hello football");
    }
}

public class lab6 {
    public static void main(String[] args) {
        check1 obj = new check1();
        obj.cricket();
        obj.footbal();
    }
}
