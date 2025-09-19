public class array_search {

    public static int search(int arr[], int x) {

        int i = 0, j = arr.length - 1;
        while (i <= j) {
            if (arr[i] == x) {
                return i;
            } else if (arr[j] == x) {
                return j;
            }
            ++i;
            --j;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 4, 6, 3 };
        int x = 5;
        System.out.println(search(arr, x));
    }
}
