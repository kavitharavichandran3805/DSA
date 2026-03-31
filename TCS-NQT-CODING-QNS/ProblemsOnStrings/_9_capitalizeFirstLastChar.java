import java.util.Scanner;

// public class CapitalizeFirstLast {

//     public static String capitalize(String s) {
//         String[] words = s.split(" ");
//         StringBuilder result = new StringBuilder();

//         for (String word : words) {
//             if (word.length() == 1) {
//                 result.append(Character.toUpperCase(word.charAt(0)));
//             } else if (word.length() > 1) {
//                 char first = Character.toUpperCase(word.charAt(0));
//                 char last = Character.toUpperCase(word.charAt(word.length() - 1));

//                 result.append(first);
//                 result.append(word.substring(1, word.length() - 1));
//                 result.append(last);
//             }
//             result.append(" ");
//         }

//         return result.toString().trim();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         System.out.println(capitalize(s));
//     }
// }
public class _9_capitalizeFirstLastChar {

    public static String capitalize(String s) {
        char ch[] = s.toCharArray();
        int start = 0, n = ch.length;
        while (start < n) {
            while (start < n && ch[start] == ' ') {
                ++start;
            }
            if (start >= n) {
                break;
            }
            int end = start;
            while (end < n && ch[end] != ' ') {
                ++end;
            }
            if (Character.isLowerCase(ch[start])) {
                ch[start] = Character.toUpperCase(ch[start]);
            }
            if (end - 1 > start && Character.isLowerCase(ch[end - 1])) {
                ch[end - 1] = Character.toUpperCase(ch[end - 1]);
            }
            start = end;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(capitalize(s));
        scan.close();
    }
}
