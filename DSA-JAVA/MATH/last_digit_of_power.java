public class last_digit_of_power {
    public static void main(String[] args) {
        int a = 27, b = 3;
        int[] cycles = new int[4];
        a = a % 10;
        cycles[0] = a;
        for (int i = 1; i < 4; i++) {
            cycles[i] = (cycles[i - 1] * a) % 10;
        }
        int index = (b - 1) % 4;
        System.out.println(cycles[index]);
    }
}
