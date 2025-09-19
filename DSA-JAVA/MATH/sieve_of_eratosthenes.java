public class sieve_of_eratosthenes {
    public static void main(String[] args) {
        int n = 10;
        boolean[] primes = new boolean[n + 1];// including 40 also
        sieve(n, primes);
    }

    public static void sieve(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        int ct = 0;
        for (boolean val : primes) {
            if (!val) {
                ++ct;
            }
        }
        System.out.println(ct - 2);
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
