public class third_largest_ele {
    public static void main(String[] args) {
        int[] arr = { 5, 5, 5 };
        if (arr.length <= 2) {
            System.out.println("Not valid");
        }
        int arr_size = arr.length;
        int first = arr[0], second = Integer.MIN_VALUE,
                third = Integer.MIN_VALUE;

        for (int i = 1; i < arr_size; i++) {

            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.println(third);
    }
}