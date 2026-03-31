
//given a binary string return the no. of substrings with all character 1's
//eg 01101110 - 9
// for 11- 3, for 111-6

//the formula to find the number of substrings = n(n+1)/2

import java.util.*;

public class _23_binary1substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int ones = 0, total = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0' && i != 0) {
                total += (ones * (ones + 1)) / 2;
                ones = 0;
            } else if (input.charAt(i) == '1') {
                ++ones;
            }
            System.out.println(ones);

        }
        if (ones > 0) {
            total += (ones * (ones + 1)) / 2;
        }
        System.out.println(total);
        scan.close();
    }
}
