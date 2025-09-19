import java.util.*;

public class uniqueChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int[] a = new int[128];
        int ind;
        for (int i = 0; i < s.length(); i++) {
            ind = (int) s.charAt(i);
            ++a[ind];
        }
        boolean isUnique = true;
        for (int i = 0; i < 128; i++) {
            if (a[i] > 1) {
                isUnique = false;
                break;
            }
        }
        System.out.println("The string contains unique values : " + isUnique);
        scan.close();
    }
}