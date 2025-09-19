import java.util.*;

public class spaceReplace {

    public static char[] brute_force(String s, String replace) {
        int sp = 0;
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                ++sp;
            }
        }
        char[] a = new char[s.length() + (sp * replace.length())];
        int index = 0;
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                for (char rep : replace.toCharArray()) {
                    a[index] = rep;
                    ++index;
                }
            } else {
                a[index] = ch;
                ++index;
            }
        }
        return a;
    }

    public static String usingStringBuilder(String s, String replace) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                sb.append(replace);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String usingInbuiltFunc(String s, String replace) {
        return s.replace(" ", replace);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String replace = "%20";
        char[] a = brute_force(s, replace);
        String ans1 = usingStringBuilder(s, replace);
        String ans2 = usingInbuiltFunc(s, replace);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(a);
        scan.close();
    }
}
