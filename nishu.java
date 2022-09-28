import javax.sql.rowset.spi.SyncResolver;

class abc {
    int x = 5;

    void display() {
        int x = 6;
        System.out.println(x);
    }
}

class cde extends abc {
    void dis() {
        System.out.println(super.x);
    }
}

public class nishu {
    public static void main(String[] args) {
        cde obj = new cde();
        obj.display();
        obj.dis();
    }
}
