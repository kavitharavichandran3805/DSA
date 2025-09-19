import java.util.Arrays;

public class gameOfTwoStacks {
    public static void main(String[] args) {
        int[] a = { 4, 2, 4, 6, 1 };
        int[] b = { 2, 1, 8, 5 };
        int target = 10;
        System.out.println(twoStacks(a, b, target, 0, 0) - 1);

    }

    public static int twoStacks(int[] a, int[] b, int t, int sum, int count) {
        if (sum > t) {
            return count;
        }
        if (a.length == 0 || b.length == 0) {
            return count;
        }
        int ans1 = twoStacks(Arrays.copyOfRange(a, 1, a.length), b, t, sum + a[0], count + 1);
        int ans2 = twoStacks(a, Arrays.copyOfRange(b, 1, b.length), t, sum + b[0], count + 1);
        return Math.max(ans1, ans2);
    }
}
