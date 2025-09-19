import java.util.ArrayList;

public class subsequence_recursion {
    public static void main(String[] args) {
        String str = "abc";
        generate_subseq("", str);
        System.out.println(generate_subseq_arraylist("", str));
    }

    public static void generate_subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        generate_subseq(p + up.charAt(0), up.substring(1));
        generate_subseq(p, up.substring(1));
    }

    // Storing them in the arraylist
    public static ArrayList<String> generate_subseq_arraylist(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = generate_subseq_arraylist(p + up.charAt(0), up.substring(1));
        ArrayList<String> right = generate_subseq_arraylist(p, up.substring(1));
        left.addAll(right);
        return left;

    }
}
