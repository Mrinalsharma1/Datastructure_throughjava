import java.util.Arrays;

public class Arachnomeshq2 {
    static void sendEmail(String arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            // System.out.println(temp);
            if (temp.charAt(0) == 'a')
                System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        String[] arr = { "ghi@hotmail.com", "def@yahoo.com", "ghi@gmail.com", "abc@channelier.com", "abc@hotmail.com",
                "def@hotmail.com", "abc@gmail.com", "abc@yahoo.com", "def@channelier.com", "jkl@hotmail.com",
                "ghi@yahoo.com", "def@gmail.com" };
        sendEmail(arr);

    }
}