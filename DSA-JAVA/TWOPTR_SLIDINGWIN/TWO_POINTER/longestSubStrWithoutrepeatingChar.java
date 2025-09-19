import java.util.HashMap;

public class longestSubStrWithoutrepeatingChar {

    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        int start = 0, len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                start = Math.max(start, hm.get(s.charAt(i)) + 1);
            }
            hm.put(s.charAt(i), i);
            len = i - start + 1;
            maxLen = Math.max(maxLen, len);

        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
