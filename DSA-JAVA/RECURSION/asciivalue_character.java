import java.util.ArrayList;

public class asciivalue_character {
    public static void main(String[] args) {
        String str = "abc";
        generate_ascii("", str);
        System.out.println(generate_ascii_arraylist("", str));
    }

    public static void generate_ascii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        generate_ascii(p + up.charAt(0), up.substring(1));
        generate_ascii(p, up.substring(1));
        generate_ascii(p + (up.charAt(0) + 0), up.substring(1));
    }

    // Storing them in the arraylist
    public static ArrayList<String> generate_ascii_arraylist(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = generate_ascii_arraylist(p + up.charAt(0), up.substring(1));
        ArrayList<String> right = generate_ascii_arraylist(p, up.substring(1));
        ArrayList<String> third = generate_ascii_arraylist(p + (up.charAt(0) + 0), up.substring(1));

        left.addAll(right);
        left.addAll(third);
        return left;

    }
}
