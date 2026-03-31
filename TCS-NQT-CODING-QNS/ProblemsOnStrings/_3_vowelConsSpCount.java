import java.util.Scanner;

public class _3_vowelConsSpCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.toLowerCase();
        int vc = 0, cc = 0, sc = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                ++sc;
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vc;
            } else {
                ++cc;
            }
        }
        System.out.println("Vowel : " + vc);
        System.out.println("Consonents : " + cc);
        System.out.println("Spaces : " + sc);
        scan.close();

    }
}
