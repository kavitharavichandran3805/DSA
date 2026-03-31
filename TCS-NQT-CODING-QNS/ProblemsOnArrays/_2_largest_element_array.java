public class _2_largest_element_array {
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 5, 6, 6 };
        int large = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > large) {
                large = a[i];
            }
        }
        System.out.println(large);
    }
}
