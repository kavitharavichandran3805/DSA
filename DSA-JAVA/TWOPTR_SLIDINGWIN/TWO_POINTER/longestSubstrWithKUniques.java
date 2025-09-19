import java.util.HashMap;

public class longestSubstrWithKUniques {

    public static int longestkSubstr(String s, int k) {
        // code here
        int l = 0, r = 0, maxLen = -1;
        HashMap<Character, Integer> hm = new HashMap<>();
        while (r < s.length()) {
            hm.put(s.charAt(r), hm.getOrDefault(s.charAt(r), 0) + 1);
            if (hm.size() > k) {
                hm.put(s.charAt(l), hm.getOrDefault(s.charAt(l), 0) - 1);
                if (hm.getOrDefault(s.charAt(l), 0) == 0) {
                    hm.remove(s.charAt(l));
                }
                ++l;
            }
            if (hm.size() == k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            ++r;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestkSubstr(s, k));
    }
}
