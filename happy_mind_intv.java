import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

CREATE TABLE second(id int REFRENCES first(id),course VARCHAR(255));

public class happy_mind_intv {
    public static void main(String[] args) {
        int arr[] = { 20, 30, 10, 30, 40, 50, 20, 40, 50 };
        // int temp[] = new int[arr.length];
        // int flag;
        // for (int i = 0; i < arr.length; i++) {
        // flag = 1;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] == arr[j]) {
        // flag++;
        // break;
        // }
        // }
        // if (flag == 1) {
        // temp[i] = arr[i];
        // }
        // }
        // for (int i = 0; i < temp.length; i++) {
        // for (int j = i + 1; j < temp.length; j++) {
        // if (temp[i] > temp[j]) {
        // int t = temp[i];
        // temp[i] = temp[i + 1];
        // temp[i + 1] = t;

        // }
        // }
        // }
        // for (int x : temp)
        // if (x != 0)
        // System.out.println(x + " ");

        HashSet<Integer> num = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            num.add(arr[i]);
        }
        // Arrays.sort(num);
        // Iterator<Integer> itr = num.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }
        int a[] = new int[num.size()];
        // for (int i = 0; i < num.size(); i++) {
        // System.out.println(num.toArray()[i]);
        // }
        int k = 0;
        for (int c : num)
            a[k++] = c;
        Arrays.sort(a);
        for (int p : a)
            System.out.println(p);
    }
}
