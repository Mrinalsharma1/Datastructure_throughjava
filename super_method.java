class student {
    String name;
    int roll;

    void student() {
        this.name = "";
        this.roll = 0;
    }

    void setData(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void showData() {
        System.out.println("Name: " + name + " Roll:" + roll);
    }
}

public class super_method {
    public static void main(String[] args) {
        student[] info = new student[10];

        for (int i = 0; i < 5; i++) {
            info[i] = new student();
            info[i].setData("Sagar" + i, 2 * i);
        }
        for (int i = 0; i < 5; i++) {
            info[i].showData();
        }

    }
}
