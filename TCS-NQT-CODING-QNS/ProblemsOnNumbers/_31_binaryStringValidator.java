import java.util.*;

// Given a binary string s and an integer d, find the minimum number of changes required so that there are no d consecutive 0s in the string.
// A "change" means converting a 0 into a 1
public class _31_binaryStringValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int d = scan.nextInt();
        scan.close();

        int changes = 0;
        int zeroRun = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeroRun++;
            } else {
                // When you hit a '1', process the previous run of zeros
                if (zeroRun > 0) {
                    changes += zeroRun / d;
                    zeroRun = 0; // reset
                }
            }
        }

        // handle trailing zeros at end
        if (zeroRun > 0) {
            changes += zeroRun / d;
        }

        System.out.println(changes);

        scan.close();
    }
}