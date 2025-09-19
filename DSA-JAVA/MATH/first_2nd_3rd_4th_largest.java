public class first_2nd_3rd_4th_largest {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int first = a[0], second = -1, third = -1, fourth = -1;
        for (int num : a) {
            if (num > first) {
                fourth = third;
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                fourth = third;
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                fourth = third;
                third = num;
            } else if (num > fourth && num != third && num != second && num != first) {
                fourth = num;
            }

        }
        System.out.println(first + " " + second + " " + third + " " + fourth);
    }
}
