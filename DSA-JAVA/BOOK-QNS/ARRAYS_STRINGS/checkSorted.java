import java.util.ArrayList;

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                ++count;
            }
        }
        if (count > 1) {
            return false;
        }
        return true;
    }
}

public class checkSorted {

    public static boolean check(ArrayList<Integer> a, int s, int e) {
        for (int i = s; i < e; i++) {
            if (a.get(i) > a.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 5 };
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
        }
        int end = arr.length - 1;
        int start = 0;
        while (!(end >= a.size())) {
            System.out.println(a.get(start) + " " + a.get(end));
            boolean isSorted = check(a, start, end);
            if (isSorted) {
                System.out.println("YES");
                System.exit(0);
            }
            ++start;
            ++end;
        }
        System.out.println("NO");
    }
}
