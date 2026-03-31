public class _1_smallest_element_array {
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 5, 6, 6 };
        int small = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < small) {
                small = a[i];
            }
        }
        System.out.println(small);
    }
}