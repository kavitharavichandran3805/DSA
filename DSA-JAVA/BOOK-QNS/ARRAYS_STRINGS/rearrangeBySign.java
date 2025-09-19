import java.util.*;

public class rearrangeBySign {
    public static void main(String[] args) {
        int[] a = { 3, 1, -2, -5, 2, -4 };
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                pos.add(a[i]);
            } else {
                neg.add(a[i]);
            }
        }
        int[] result = new int[a.length];
        int index = 0;
        for (int i = 0; i < pos.size(); i++) {
            result[index++] = pos.get(i);
            result[index++] = neg.get(i);
        }
        System.out.println(Arrays.toString(result));
    }
}
