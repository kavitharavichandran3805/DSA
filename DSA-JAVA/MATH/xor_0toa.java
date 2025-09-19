public class xor_0toa {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            } else if (i % 4 == 1) {
                System.out.println(1);
            } else if (i % 4 == 2) {
                System.out.println(i + 1);
            } else {
                System.out.println(0);
            }
        }
    }

}
