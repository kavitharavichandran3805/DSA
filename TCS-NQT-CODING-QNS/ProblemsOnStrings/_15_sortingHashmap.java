
import java.util.*;

public class _15_sortingHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("banana", 2);
        map.put("apple", 5);
        map.put("cherry", 3);

        // Convert map to a list of entries
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        // Sort using compareTo (ascending order)
        Collections.sort(entries, (a, b) -> a.getKey().compareTo(b.getKey()));
        // in descending order
        // Collections.sort(entries, (a, b) -> b.getKey().compareTo(a.getKey()));

        // Print sorted entries
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
