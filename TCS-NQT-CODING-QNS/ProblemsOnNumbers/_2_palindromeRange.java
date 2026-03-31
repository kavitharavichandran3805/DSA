public class _2_palindromeRange {

    public static boolean isPalindrome(int num) {
        int n = num, rem, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int min = 10, max = 50;
        for (int i = min; i <= max; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
