import java.util.*;

public class _13_reverseDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0, rem;
        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num /= 10;
        }
        System.out.println(sum);
        scan.close();
    }
}
