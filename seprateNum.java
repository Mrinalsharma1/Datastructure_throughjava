import java.util.HashSet;

public class seprateNum {
    public static void main(String[] args) {
        HashSet<Long> set = new HashSet<>();
        String str = "78910"; // 9,10,11 - 99,100
        long prev = 0;
        long curr = str.charAt(0) - '0';
        long w = 0;
        for (int i = 1; i < str.length(); i++) {
            int n = str.charAt(i) - '0';
            w = (w * 10) + n;
            if (curr == w || w == 0) {
                curr = curr * 10 + w;
                w = 0;
            } else if (curr < w) {
                prev = curr;
                curr = w;
                w = 0;
                set.add(prev);
            }

        }
        set.add(curr);
        // System.out.println(set);
        Long setArr[] = set.toArray(new Long[set.size()]);
        boolean flag = true;
        for (int i = 1; i < setArr.length; i++) {
            if (setArr[i] - setArr[i - 1] != 1)
                flag = false;
        }
        System.out.println(flag);
    }
}
