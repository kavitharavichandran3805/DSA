import java.util.Scanner;

public class _6_replaceOtherChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
        scan.close();
    }
}
