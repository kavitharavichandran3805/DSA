import java.util.Arrays;

public class checkPermutation {
    public static void main(String[] args) {
        String s1 = "122";
        String s2 = "212";
        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        s1 = new String(a1);
        s2 = new String(a2);
        System.out.println(s1 + s2);
        if (s1.equals(s2)) {
            System.out.println("First string is permutation of another one");
        } else {
            System.out.println("First string is not a permutation of another one");
        }
    }
}
