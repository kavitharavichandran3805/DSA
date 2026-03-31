import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class _15_longestSubstringWithoutRepeatingChar {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int maxLen = 0, start = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                start = Math.max(start, hm.get(ch) + 1);
            }
            hm.put(ch, i);
            maxLen = Math.max(maxLen, i - start + 1);
        }
        System.out.println(maxLen);
    }
}
