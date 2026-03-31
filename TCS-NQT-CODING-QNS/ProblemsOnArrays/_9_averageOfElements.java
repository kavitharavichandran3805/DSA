public class _9_averageOfElements {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int sum = 0;
        float avg = 0;
        for (int val : a) {
            sum += val;
        }
        avg = (float) sum / a.length;
        System.out.printf("%.2f", avg);
    }
}
