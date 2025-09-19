import java.util.Arrays;

public class three_timesEle {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 4, 2, 7, 7, 8, 7, 8, 8 };
        int[] bitcount = new int[32];
        for (int num : arr) {
            for (int i = 0; i < 32; i++) {
                bitcount[i] += (num >> i) & 1;
            }
        }
        System.out.println(Arrays.toString(bitcount));

        int result = 0;

        for (int i = 0; i < 32; i++) {
            if (bitcount[i] % 3 != 0) {
                result = result | (1 << i);
            }
        }
        System.out.println(result);

    }
}