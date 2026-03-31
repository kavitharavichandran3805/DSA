import java.util.HashMap;
import java.util.Map;

public class _14_repeatingElements {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 3, 4, 4, 5, 2 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (hm.get(a[i]) == null) {
                hm.put(a[i], 1);
            } else {
                hm.put(a[i], hm.get(a[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 1)
                System.out.print(entry.getKey() + " ");
        }
    }
}
