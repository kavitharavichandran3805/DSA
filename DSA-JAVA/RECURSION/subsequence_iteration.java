import java.util.ArrayList;
import java.util.List;

public class subsequence_iteration {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3 };
        List<List<Integer>> result = generate_subset(a);
        for (List<Integer> l : result) {
            System.out.println(l);
        }
    }

    public static List<List<Integer>> generate_subset(int[] a) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : a) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);

            }
        }
        return outer;

    }
}
