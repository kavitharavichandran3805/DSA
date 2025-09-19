public class stringCompression {
    public static void main(String[] args) {
        String inp = "aabbbcdd";
        int[] a = new int[26];
        for (char ch : inp.toCharArray()) {
            a[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int val = a[i];
            if (val != 0) {
                char ch = (char) (i + 'a');
                if (val == 1) {
                    sb.append(ch);
                } else {
                    sb.append(ch);
                    sb.append(val);
                }
            }
        }

        if (sb.toString().length() > inp.length()) {
            System.out.println(inp);
        } else {
            System.out.println(sb.toString());
        }
    }
}
