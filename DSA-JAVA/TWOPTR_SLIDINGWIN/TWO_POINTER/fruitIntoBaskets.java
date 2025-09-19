import java.util.HashMap;

public class fruitIntoBaskets {

    public static int totalFruit(int[] a) {
        int l = 0, r = 0, maxLen = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        while (r < a.length) {
            hm.put(a[r], hm.getOrDefault(a[r], 0) + 1);
            if (hm.size() > 2) {
                hm.put(a[l], hm.getOrDefault(a[l], 0) - 1);
                if (hm.getOrDefault(a[l], 0) == 0) {
                    hm.remove(a[l]);
                }
                ++l;
            }
            if (hm.size() <= 2) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            ++r;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 2, 2 };
        System.out.println(totalFruit(a));
    }
}
