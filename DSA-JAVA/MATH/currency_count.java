public class currency_count {
    public static void main(String[] args) {
        int[] notes = new int[] { 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int count[] = new int[9];
        int amount = 34343;
        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                count[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        for (int i = 0; i < 9; i++) {
            if (count[i] != 0) {
                System.out.println(notes[i] + " : " + count[i]);
            }
        }

    }
}
