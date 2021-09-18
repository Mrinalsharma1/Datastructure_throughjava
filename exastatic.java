public class exastatic {
    void show() {
        System.out.print("this is normal method \n");
    }

    static int show1(int x, int y) {

        System.out.print("this is an example of static mrethod  " + (x + y) + "\n");
        return (x + y);
    }

    public static void main(String[] args) {
        exastatic mk = new exastatic();
        mk.show();
        int take = show1(5, 3);
        System.out.println(take);
    }
}
