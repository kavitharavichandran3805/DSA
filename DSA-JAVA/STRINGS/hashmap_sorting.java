import java.util.*;

public class hashmap_sorting {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);
        sortByKey1(map);
        System.out.println();
        sortByKey2(map);

    }

    public static void sortByKey1(Map<String, Integer> m) {
        ArrayList<String> a = new ArrayList<>(m.keySet());
        Collections.sort(a);
        for (int i = 0; i < 5; i++) {
            System.out.println("Name : " + a.get(i) + " Score : " + m.get(a.get(i)));
        }

    }

    public static void sortByKey2(Map<String, Integer> m) {
        ArrayList<String> a = new ArrayList<>(m.keySet());
        int n = a.size();
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 1; j <= n - i - 1; j++) {
                if ((a.get(j).compareTo(a.get(j - 1)) < 0)) {
                    String temp = a.get(j);
                    a.set(j, a.get(j - 1));
                    a.set(j - 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Name : " + a.get(i) + " Score : " + m.get(a.get(i)));
        }
    }
}