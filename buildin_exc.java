public class buildin_exc {
    // throw example here
    // static void avg() {
    // try {
    // throw new Exception("demo");
    // } catch (Exception e) {
    // System.out.print("system uncaught");
    // }
    // }

    // throws example
    static void avg() throws Exception {
        System.out.println("inside average function");
        throw new Exception("demo");
    }

    public static void main(String[] args) throws Exception {
        try {
            avg();
        } finally {
            // TODO: handle exception
            System.out.println("system uncaught");
        }

        // throw example
        // avg();

        // try {
        // int a = 10, b = 0, div = 0;
        // div = a / b;
        // System.out.print("divided number is" + div);
        // }
        // // use of final method it is excuted in any case
        // finally {
        // System.out.println("can't divided by number");
        // }
        // // catch (Exception e) {
        // // // TODO: handle exception
        // // System.out.println("can't divided by number");
        // // }
        // // try {
        // // int num = Integer.parseInt("mrinal");
        // // System.out.print(+num);
        // // } catch (Exception e) {
        // // // TODO: handle exception
        // // System.out.println("number formate excepction");
        // // }
    }
}
