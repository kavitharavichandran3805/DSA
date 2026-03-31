// Problem Statement: Given an array of integers, having some duplicate elements, sort the array by frequency.

// Examples:

// Example 1:
// Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
// Output: 2 2 2 1 1 3 3 4 
// Explanation: Since  2 is present 3 times in an array , so print it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it will be printed at last.

// Example 2:
// Input: N = 6, array[] = {-199,6,7,-199,3,5}
// Output: -199 -199 3 5 6 7
// Explanation: Since -199 is present 2 times so it will be printed at first , then 3 , 5 ,6 ,7 are present once in array , so print them in their sorted order.

import java.util.*;

class Pair {
    int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class _19_frequencySort {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 2, 4, 3, 1, 2 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (!hm.containsKey(a[i])) {
                hm.put(a[i], 1);
            } else {
                hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
            }
        }
        ArrayList<Pair> list = new ArrayList<>();
        for (int key : hm.keySet()) {
            list.add(new Pair(key, hm.get(key)));
        }
        Collections.sort(list, (x, y) -> {
            if (x.second == y.second) {
                return x.first - y.first;
            } else {
                return y.second - x.second;
            }
        });
        for (int i = 0; i < list.size(); i++) {
            while (list.get(i).second > 0) {
                System.out.print(list.get(i).first + " ");
                list.get(i).second--;
            }
        }
        // System.out.println(hm);
    }
}
