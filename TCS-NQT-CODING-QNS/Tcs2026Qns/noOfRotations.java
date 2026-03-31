import java.io.*;
// import java.util.*;

public class noOfRotations {

    public static boolean isMatch(int[] a, int[] b, int start) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[(start + i) % n] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        String[] input1 = bf.readLine().split(" ");
        String[] input2 = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
            arr2[i] = Integer.parseInt(input2[i]);
        }
        int leftRot = -1, rightRot = -1;
        for (int i = 1; i < n; i++) {
            if (leftRot == -1 && isMatch(arr1, arr2, i)) {
                leftRot = i;
            }
            if (rightRot == -1 && isMatch(arr1, arr2, (n - i) % n)) {
                rightRot = i;
            }
        }
        System.out.println(Math.min(leftRot, rightRot));

    }
}
