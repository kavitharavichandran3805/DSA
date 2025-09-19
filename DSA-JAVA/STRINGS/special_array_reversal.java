import java.util.*;

public class special_array_reversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int i = 0, j = s.length() - 1;
        char[] a = s.toCharArray();
        while (i <= j) {
            if (!Character.isLetter(a[i])) {
                ++i;
            } else if (!Character.isLetter(a[j])) {
                --j;
            } else {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                ++i;
                --j;
            }
        }
        s = new String(a);
        System.out.println(s);
        scan.close();
    }
}
