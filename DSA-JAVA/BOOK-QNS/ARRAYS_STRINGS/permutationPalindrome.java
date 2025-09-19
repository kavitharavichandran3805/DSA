public class permutationPalindrome {
    public static void main(String[] args) {
        String input = "tact coa";
        input = input.toLowerCase().strip();
        int[] a = new int[26];
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                a[ch - 'a']++;
            }
        }
        int oddCount = 0;
        for (int ct : a) {
            if (ct % 2 != 0) {
                ++oddCount;
            }
        }
        if (oddCount <= 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
