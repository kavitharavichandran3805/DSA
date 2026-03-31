import java.util.HashMap;
import java.util.Map;

public class _5_frequency_count {
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 5, 2, 3, 4, 1, 7, 6, 5, 8 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (hm.getOrDefault(a[i], 0) > 0) {
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], hm.getOrDefault(hm, 0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println("Keys : " + entry.getKey() + " Values : " + entry.getValue());
        }
    }
}
