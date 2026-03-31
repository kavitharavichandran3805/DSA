import java.util.*;

public class subsetOfArray {
    public static void findSubsets(int[] arr, int index, List<Integer> current) {
        // Base case: we've processed all elements
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // CHOICE 1: Include current element
        current.add(arr[index]);
        findSubsets(arr, index + 1, current);

        // CHOICE 2: Exclude current element (backtrack)
        current.remove(current.size() - 1);
        findSubsets(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<Integer> current = new ArrayList<>();
        findSubsets(arr, 0, current);
    }
}
