public class trappingRainWater {

    // brute force
    public static int trapBrute(int[] height) {
        int n = height.length;
        int water = 0;

        for (int i = 0; i < n; i++) {
            int leftMax = 0, rightMax = 0;

            // Find max height to the left
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            // Find max height to the right
            for (int j = i; j < n; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            // Water trapped at index i
            water += Math.min(leftMax, rightMax) - height[i];
        }

        return water;
    }

    // better

    public static int trapBetter(int[] height) {
        int n = height.length;
        if (n == 0)
            return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int water = 0;

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++)
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--)
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);

        for (int i = 0; i < n; i++)
            water += Math.min(leftMax[i], rightMax[i]) - height[i];

        return water;
    }

    // optimal
    public static int getMaxUnits(int[] a) {
        int l = 0, r = a.length - 1;
        int maxLeft = 0, maxRight = 0;
        int result = 0;
        while (l <= r) {
            if (a[l] <= a[r]) {
                if (a[l] > maxLeft) {
                    maxLeft = a[l];
                } else {
                    result += maxLeft - a[l];
                }
                l++;
            } else {
                if (a[r] > maxRight) {
                    maxRight = a[r];
                } else {
                    result += maxRight - a[r];
                }
                r--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(getMaxUnits(a));
    }
}
