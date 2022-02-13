public class narg {
    static void display(int n, String... value) {
        System.out.print("number is :" + n);
        for (String s : value) {
            System.out.print(s + "\n");
        }
    }

    public static void main(String[] args) {
        display(10, "name");
        display(100, "my", "name", "is", "mrinal", "kumar");
    }
}
