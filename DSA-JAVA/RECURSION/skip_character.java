public class skip_character {
    public static void main(String[] args) {
        skip1("", "bccaaaccb", 'a');
        System.out.println();
        System.out.println(skip2("bccaaaccb", 'a'));
    }

    // Approach 1 - Passing the string as an argument
    public static void skip1(String p, String up, char charTobeRemoved) {
        if (up.isEmpty()) {
            System.out.print(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == charTobeRemoved) {
            skip1(p, up.substring(1), charTobeRemoved);
        } else {
            skip1(p + ch, up.substring(1), charTobeRemoved);
        }
    }

    // Approach 2 - Create the ans variable inside the function body

    public static String skip2(String up, char charTobeRemoved) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == charTobeRemoved) {
            return skip2(up.substring(1), charTobeRemoved);
        }
        return ch + skip2(up.substring(1), charTobeRemoved);
    }

}
