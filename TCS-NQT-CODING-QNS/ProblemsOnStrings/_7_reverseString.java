import java.util.Scanner;

public class _7_reverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
            char temp = ch[ch.length - i - 1];
            ch[ch.length - i - 1] = ch[i];
            ch[i] = temp;
        }
        s = new String(ch);
        System.out.println(s);
        scan.close();
    }
}
