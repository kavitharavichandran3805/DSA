// Problem: Given a string, calculate the sum of numbers in a string (multiple consecutive digits are considered one number)

// Examples:

// Example 1:
// Input: string = “123xyz”
// Output: 123

// Example 2:
// Input: string = “1xyz23”
// Output: 24

import java.util.Scanner;

public class _8_sumOfNumbersInStr {
    public static int getSum(String s) {
        int sum = 0;
        String tempSum = "0";
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                tempSum += ch;
            } else {
                sum += Integer.parseInt(tempSum);
                tempSum = "0";
            }
        }
        return sum + Integer.parseInt(tempSum);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(getSum(s));
        scan.close();
    }
}
