import java.util.*;

public class permutations {
    public static void main(String[] args) {
        String s = "abc";
        perm("", s);
        ArrayList<String> str = permList("", s);
        System.out.println(str);
        int count = getCount("", s);
        System.out.println(count);
    }

    public static void perm(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            perm(f + ch + s, up.substring(1));

        }
    }

    public static ArrayList<String> permList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permList(f + ch + s, up.substring(1)));

        }
        return ans;
    }

    public static int getCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + (getCount(f + ch + s, up.substring(1)));

        }
        return count;
    }
}
