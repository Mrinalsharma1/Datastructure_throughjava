class test {
    final void display(final int x) {
        final int y = x;
        int z = y + 10;
        System.out.print("this is final example \n");
        System.out.print(z);
    }
}

public class finalex extends test {
    public static void main(String[] args) {
        finalex mk = new finalex();
        mk.display(10);

    }
}
