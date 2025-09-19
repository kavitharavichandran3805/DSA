public class oneStepAway {

    public static boolean oneReplace(String s1, String s2) {
        boolean diff = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diff) { // already found one difference
                    return false;
                }
                diff = true;
            }
        }
        return true;
    }

    public static boolean oneRemove(String s1, String s2) {
        int i = 0, j = 0;
        boolean diff = false;
        while (i != s1.length() && j != s2.length()) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (diff) {
                    return false;
                }
                diff = true;
                ++j;
            } else {
                ++i;
                ++j;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cba";
        boolean isTrue = false;
        if (s1.length() == s2.length()) {
            isTrue = oneReplace(s1, s2);
        } else if (s1.length() - s2.length() > 1) {
            isTrue = false;
        }
        if (s1.length() > s2.length()) {
            isTrue = oneRemove(s2, s1);
        } else {
            isTrue = oneRemove(s1, s2);
        }
        if (isTrue) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
