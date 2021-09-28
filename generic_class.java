public class generic_class {
    public static <E> void PrintArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }

    // void disp() {
    // System.out.println("check now");
    // }

    public static void main(String[] args) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'm', 'r', 'i', 'n', 'a', 'l' };

        System.out.println("Printing Intiger Array");
        PrintArray(intArray);
        // generic_class abc = new generic_class();
        // abc.disp();

        System.out.println("Printing Character Array");
        PrintArray(charArray);
    }
}
