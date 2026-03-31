import java.util.*;
// Problem Statement

// Given a string containing multiple words, find the word that contains the highest number of occurrences of any single letter.

// Ignore case (treat letters as lowercase).

// Consider only letters a–z.

// If multiple words have the same maximum frequency, return the first one.

// If no word has a repeated letter, return -1.

// Input:

// successes address

// Processing:

// "successes" → s=4, c=2, e=2, u=1 → max repeat = 4

// "address" → d=2, r=1, e=1, s=2, a=1 → max repeat = 2

// Output:

// successes
public class _13_highestRepeated {
    public static String findWord(String str) {
        String[] words = str.split(" ");
        String result = "-1";
        int maxRepeat = 1; // initially no repeats

        for (String word : words) {
            int[] freq = new int[26]; // for a–z letters
            int localMax = 1;

            for (char ch : word.toCharArray()) {
                if (Character.isLetter(ch)) {
                    freq[ch - 'a']++;
                    localMax = Math.max(localMax, freq[ch - 'a']);
                }
            }

            if (localMax > maxRepeat) {
                maxRepeat = localMax;
                result = word;
            }
        }

        return (maxRepeat == 1) ? "-1" : result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        System.out.println(findWord(input));
        sc.close();
    }
}
