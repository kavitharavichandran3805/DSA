import java.util.*;

public class _20_primeFactors {

    public static List<Integer> getPrimeFactors(int n) {
        List<Integer> result = new ArrayList<>();
        if (n % 2 == 0) {
            result.add(2);
            while (n % 2 == 0) {
                n /= 2;
            }
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                result.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 1)
            result.add(n);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> result = getPrimeFactors(n);
        System.out.println(result);
        scan.close();
    }
}
