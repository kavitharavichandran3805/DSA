// skip the string if it is not the required string
public class skip_string2 {
    public static void main(String[] args) {
        System.out.println(skipString2("bccappappleccb", "app", "apple"));
    }

    public static String skipString2(String up, String remove, String need) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith(remove) && !up.startsWith(need)) {
            return skipString2(up.substring(remove.length()), remove, need);
        }
        return up.charAt(0) + skipString2(up.substring(1), remove, need);
    }
}
