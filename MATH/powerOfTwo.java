public class powerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println((n & (n - 1)) == 0);
    }
}
