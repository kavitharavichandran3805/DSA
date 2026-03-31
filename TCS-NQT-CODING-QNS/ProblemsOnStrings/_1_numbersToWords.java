import java.util.*;

public class _1_numbersToWords {

    public static String toWords(int n) {
        StringBuilder sb = new StringBuilder();
        if (n == 0)
            return "Zero";
        String ones[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String tens[] = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
        if (n >= 1000) {
            sb.append(ones[n / 1000]).append(" thousand ");
            n %= 1000;
        }
        if (n >= 100) {
            sb.append(ones[n / 100]).append(" hundred ");
            n %= 100;
        }
        if (n >= 20) {
            sb.append(tens[n / 10]).append(" ");
            n %= 10;
        }
        if (n > 0) {
            sb.append(ones[n]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(toWords(n));
        scan.close();
    }
}
