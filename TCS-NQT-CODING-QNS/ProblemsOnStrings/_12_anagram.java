import java.util.*;

public class _12_anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        s1 = new String(ch1);
        s2 = new String(ch2);
        if (s1.equals(s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
        scan.close();
    }
}
