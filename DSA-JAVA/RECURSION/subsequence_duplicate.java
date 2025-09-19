import java.util.*;

public class subsequence_duplicate {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2 };
        List<List<Integer>> list = generate_subseq(a);
        for (List<Integer> l : list) {
            System.out.println(l);
        }
    }

    public static List<List<Integer>> generate_subseq(int[] a) {
        List<List<Integer>> outer = new ArrayList<>();
        int start = 0, end = 0;
        outer.add(new ArrayList<>());
        for (int i = 0; i < a.length; i++) {
            start = 0;
            if (i > 0 && a[i] == a[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(a[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
