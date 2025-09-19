public class reverse_number_pyramid {
    // 1 2 3 4
    // 2 3 4
    // 3 4
    // 4 in pyramid form with spaces in the front
    public static void main(String[] args) {
        int n = 4;
        int val = n;
        for (int i = 0; i < n; i++) {
            for (int sp = 0; sp < i; sp++) {
                System.out.print(" ");
            }
            for (int j = i + 1; j <= val; j++) {
                System.out.print(j + " ");

            }

            System.out.println();
        }
    }
}
