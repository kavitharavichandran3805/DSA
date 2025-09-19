import java.util.ArrayList;

public class phonePad {
    public static void main(String[] args) {
        String input = "12";
        phonepad("", input);
        ArrayList<String> output = phonepadArraylist("", input);
        System.out.println(output);
        int count = getCount("", input);
        System.out.println(count);
    }

    public static void phonepad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            phonepad(p + ch, up.substring(1));
        }
    }

    public static ArrayList<String> phonepadArraylist(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> result = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            result.addAll(phonepadArraylist(p + ch, up.substring(1)));
        }
        return result;
    }

    public static int getCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int digit = up.charAt(0) - '0';
        int count = 0;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + getCount(p + ch, up.substring(1));
        }
        return count;
    }
}