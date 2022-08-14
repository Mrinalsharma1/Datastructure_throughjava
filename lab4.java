public class lab4 {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat("Nhce"));

        StringBuffer abc = new StringBuffer("hello NHCE");
        System.out.println(abc.length());
        System.out.println(abc.capacity());
        System.out.println(abc.reverse());
        System.out.println(abc.insert(5, "ke"));
        System.out.println(abc.delete(4, 9));
    }
}
