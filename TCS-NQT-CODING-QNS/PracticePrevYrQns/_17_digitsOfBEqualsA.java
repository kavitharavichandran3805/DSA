// Given an integer $a$, find the smallest positive integer $b$ such that the product of 
// the digits of $b$ equals $a$.

import java.util.*;
import java.io.*;

public class _17_digitsOfBEqualsA {

    public static int getB(int a) {
        if (a == 0)
            return -1;
        if (a < 10)
            return 10 + a;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 9; i >= 2; i--) {
            while (a % i == 0) {
                arr.add(i);
                a /= i;
            }
        }
        if (a > 1)
            return -1;
        int digit = 0;
        Collections.sort(arr);
        for (int num : arr) {
            digit = digit * 10 + num;
        }
        return digit;

    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        System.out.println(getB(a));
    }
}