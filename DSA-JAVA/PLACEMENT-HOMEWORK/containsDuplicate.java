import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {

    public static boolean containsDup(int[] nums) {

        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            if (s.contains(num))
                return true;
            s.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1 };
        System.out.println(containsDup(a));
    }
}
