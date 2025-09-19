import java.util.Arrays;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String s1 = new String(arr1);
        String s2 = new String(arr2);
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String a = "rat";
        String b = "car";
        System.out.println(isAnagram(a, b));
    }
}
