
interface showcase {
    void show();

    interface showtext {
        void display();

        interface nextshow {
            void last();
        }
    }
}

public class nestedinterface implements showcase.showtext.nextshow {
    public void last() {
        System.out.println("this is neated nested method");
    }

    public void display() {
        System.out.println("this is neated method");
    }

    public void show() {
        System.out.println("this is normal method");
    }

    public static void main(String[] args) {
        // showcase.showtext.nextshow mk = new nestedinterface();
        nestedinterface mk = new nestedinterface();
        mk.last();
        // nestedinterface mk1 = new nestedinterface();
        mk.display();
        mk.show();
    }
}
