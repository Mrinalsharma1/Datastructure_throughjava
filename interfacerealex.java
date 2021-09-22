
interface Vehicle {

    // all are the abstract methods.
    void changeGear(int a);

    void speedUp(int a);

    void applyBrakes(int a);
}

class Bicycle implements Vehicle {

    int speed;
    int gear;
    int slow;

    // to change gear
    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement) {

        slow = speed - decrement;
    }

    public void display() {
        System.out.println("speed: " + speed + " gear: " + gear + " Downspeed: " + slow);
    }
}

class Bike implements Vehicle {

    int speed;
    int gear;
    int slow;

    // to change gear
    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement) {

        slow = speed - decrement;
    }

    public void display() {
        System.out.println("speed: " + speed + " gear: " + gear + " Downspeed: " + slow);
    }
}

class interfacerealex {
    public static void main(String[] args) {
        Bicycle mk = new Bicycle();
        mk.changeGear(2);
        mk.speedUp(10);
        mk.applyBrakes(4);
        System.out.print("this data is for Bicycle \n");
        mk.display();

        Bike mk1 = new Bike();
        mk1.changeGear(2);
        mk1.speedUp(10);
        mk1.applyBrakes(4);
        System.out.print("this data is for Bike \n");
        mk1.display();
    }

}
