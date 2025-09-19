
public class stringRotation {

    public static boolean checkRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        StringBuilder sb1 = new StringBuilder(s1);
        for (int i = 0; i < s1.length(); i++) {
            char ch = sb1.charAt(0);
            sb1.deleteCharAt(0);
            sb1.append(ch);
            System.out.println(sb1.toString());
            if (sb1.toString().equals(s2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean optimal(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        return (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        String a = "waterbottle";
        String b = "erbottlewat";
        System.out.println(checkRotation(a, b));
        System.out.println(optimal(a, b));

    }
}
