import java.util.Scanner;

public class _4_removeVowels {
    public static String removeVowels(String s) {
        // Use StringBuilder to build result
        StringBuilder result = new StringBuilder();

        // Traverse each character
        for (char ch : s.toCharArray()) {
            // Convert to lowercase for comparison
            char lower = Character.toLowerCase(ch);

            // Skip vowels
            if (lower == 'a' || lower == 'e' || lower == 'i' ||
                    lower == 'o' || lower == 'u') {
                continue;
            }

            // Append non-vowel
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb.toString());
        scan.close();
    }
}
