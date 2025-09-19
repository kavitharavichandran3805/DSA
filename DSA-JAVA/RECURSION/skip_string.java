public class skip_string {
    public static void main(String[] args) {
        System.out.println(skipString("bccappleccb", "apple"));
    }

    public static String skipString(String up, String remove) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith(remove)) {
            return skipString(up.substring(remove.length()), remove);
        }
        return up.charAt(0) + skipString(up.substring(1), remove);
    }
}
