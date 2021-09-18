public class stringbuf {
    public static void main(String[] args) {
        int a = 123;
        StringBuffer Sbuffer = new StringBuffer("test");
        Sbuffer.append(" String Buffer");
        System.out.print("string is - " + Sbuffer + "\n");
        System.out.print("string is - " + Sbuffer.length() + "\n");
        System.out.print("string is - " + Sbuffer.append(a) + "\n");
        System.out.print("string is - " + Sbuffer.reverse());
    }
}
