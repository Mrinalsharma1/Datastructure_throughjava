class first {
    void a() {
        System.out.println("this is A class");
    }
}

class second extends first {
    void b() {
        System.out.println("this is B class");
    }
}

class third extends second {
    void c() {
        System.out.println("this is C class");
    }
}

public class multilevelex {
    public static void main(String[] args) {
        third mk = new third();
        mk.a();
        mk.b();
        mk.c();
    }
}
