interface car {
    public void color();

    public void price();
}

interface bike {
    public void speed();

}

class display implements car, bike {
    public void color() {
        System.out.print("car color is red \n");
    }

    public void price() {
        System.out.print("car price is 1000 \n");
    }

    public void speed() {
        System.out.print("bike speed is 70KM \n");
    }

}

public class interfaceex {
    public static void main(String[] args) {
        display mk = new display();
        mk.color();
        mk.price();
        mk.speed();
    }
}
