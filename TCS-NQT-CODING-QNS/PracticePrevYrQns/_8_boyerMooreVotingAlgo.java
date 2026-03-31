
// This code is solving a specific problem: Finding the "Majority Element." In programming, a majority element is 
// a number that appears more than half the time in an array (it has to be $> 50\%$).The algorithm used here is 
// called the Boyer-Moore Voting Algorithm. Think of it like a political election where people are "fighting" for 
// their candidate.The "Battle Royale" Logic (Step 1)Imagine every number in the array is a soldier from a different army.
// If two soldiers from the same army meet, they join forces (Count increases).If two soldiers from different armies meet, 
// they fight and both are knocked out (Count decreases).Because the "Majority" candidate has more than half the soldiers, 
// they will always have at least one soldier standing at the end, even if everyone else tries to knock them out.
// How the code does it:if (count == 0): No one is currently winning. The next number becomes the new candidate.
// else if (num == candidate): We found another soldier for our current leader. Count goes up.
// else: We found an enemy! They fight, and our leader loses one soldier. Count goes down.
// 
// The "Double Check" (Step 2)The first part only gives us a potential winner. But what if there was no majority at all?
// Example: In the array [1, 2, 3], the "winner" might end up being 3 just because it was last, even though it only appeared once.
// So, the second for loop simply counts how many times that candidate actually appeared. If it’s more than arr.length / 2, 
// it’s the true winner. If not, we return -1.\

// import java.util.*;
import java.io.*;

//we can also solve this problem by using hashmap
public class _8_boyerMooreVotingAlgo {

    public static int getMajorityElement(int[] a, int n) {
        int count = 0, candidate = -1;
        for (int num : a) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                ++count;
            } else {
                --count;
            }
        }
        count = 0;
        for (int num : a) {
            if (num == candidate) {
                ++count;
            }
        }
        if (count > (n / 2)) {
            return candidate;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(bf.readLine());
        }
        System.out.println(getMajorityElement(a, n));
    }
}
