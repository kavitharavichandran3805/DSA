import java.util.Scanner;

// Minimum Bit Flips to Convert Number
// Problem Statement:
// A bit flip of a number x is choosing a bit in the binary representation of
//  x and flipping it from either 0 to 1 or 1 to 0.

// For example, for x = 7, the binary representation is 111 and we may choose any 
// bit (including any leading zeros not shown) and flip it. We can flip the first bit
// from the right to get 110, flip the second bit from the right to get 101, flip the
//  fifth bit from the right (a leading zero) to get 10111, etc.

// Given two integers start and goal, return the minimum number of bit flips to convert start to goal.
//XOR works based on this truth table:

// 0 ^ 0 = 0 (Same)

// 1 ^ 1 = 0 (Same)

// 0 ^ 1 = 1 (Different)

// 1 ^ 0 = 1 (Different)

// So, start ^ goal creates a binary number where every 1 represents a position where you must perform a flip.

public class _25_minimumFlipBits {

    public static int getCount(int n) {
        int ct = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                ++ct;
            }
            n >>= 1;
        }
        return ct;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int goal = scan.nextInt();
        int xor = start ^ goal;
        System.out.println(getCount(xor));
        scan.close();
    }
}
