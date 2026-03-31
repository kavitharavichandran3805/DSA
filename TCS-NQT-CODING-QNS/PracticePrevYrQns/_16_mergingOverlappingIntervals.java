
// This problem is all about merging meetings that have overlapping times. If Meeting A is from 1:00 to 3:00 and 
// Meeting B is from 2:00 to 6:00, you really just have one long session from 1:00 to 6:00.Here is how the code 
// handles this logic in plain English.1. The Strategy: "The Timeline Approach"The most important part of this 
// code isn't the loop; it’s the Sort. By sorting the intervals by their "Start Time," we turn a messy pile of 
// intervals into a chronological timeline.If the intervals are sorted, we only ever have to look at the last 
// interval we processed to see if the new one overlaps. We don't have to look back at the whole list.
// 
// 2. Step-by-Step Logic
// Step A: SortingArrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
// This tells Java: "Look at the first number (the start time) of each pair and put them in order.
// "Before: [[8,10], [1,3], [15,18], [2,6]]After: [[1,3], [2,6], [8,10], [15,18]]
// Step B: The "Current" IntervalWe pick the first interval [1,3] and call it our current worker. 
// This is the one we are trying to grow.
// Step C: The Loop (The Comparison)We look at the next interval in line (let's say [2,6]) and 
// ask:"Does the start of this new meeting happen before or at the same time the current meeting ends?"
// IF YES (Overlap):We don't need a new entry in our list. We just stretch our current meeting’s end time.
// We use Math.max(current[1], next[1]).Example: [1,3] meets [2,6]. Since 2 is less than 3, they overlap. 
// The new end is the bigger of 3 and 6. Result: [1,6].IF NO (Gap):This means there is a break in the timeline.
// We save our current interval [1,6] to our "Final List."We jump to the new interval [8,10] and make that 
// our new current worker.3. Walkthrough with Example 1Input: [[1,3], [2,6], [8,10], [15,18]]
// Start: current = [1,3].Check [2,6]: Does 2 start before 3 ends? Yes.
// Merge: current becomes [1, max(3,6)] $\rightarrow$ [1,6].Check [8,10]: Does 8 start before 6 ends? 
// No.Action: Save [1,6] to the list.New Start: current is now [8,10].Check [15,18]: Does 15 start before 10 ends? 
// No.Action: Save [8,10] to the list.New Start: current is now [15,18].Finish: Loop ends. Save the final current ([15,18]).
// Final Result: [[1,6], [8,10], [15,18]]

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class _16_mergingOverlappingIntervals {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // first line = number of intervals

        int[][] intervals = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().trim().split(" "); // split line by space
            intervals[i][0] = Integer.parseInt(parts[0]); // start
            intervals[i][1] = Integer.parseInt(parts[1]); // end
        }

        // Now intervals array is ready to be passed to merge function
        int[][] merged = merge(intervals);

        // Print merged intervals
        for (int[] interval : merged) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }

    public static int[][] merge(int[][] a) {
        if (a.length <= 1)
            return a;
        Arrays.sort(a, (x, y) -> x[0] - y[0]);
        ArrayList<int[]> merged = new ArrayList<>();
        int[] current = a[0];
        for (int i = 1; i < a.length; i++) {
            if (current[1] >= a[i][0]) {
                current[1] = Math.max(current[1], a[i][1]);
            } else {
                merged.add(current);
                current = a[i];
            }
        }
        merged.add(current);
        return merged.toArray(new int[merged.size()][]);
    }
}
