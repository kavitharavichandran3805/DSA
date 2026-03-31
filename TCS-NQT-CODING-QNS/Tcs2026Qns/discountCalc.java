import java.util.*;

//  < 1000 - 5%, >=1000 and <5000 - 10%, >=5000 - 15%

public class discountCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amt = scan.nextInt();
        double discount = 0;
        if (amt < 1000) {
            discount = (5.0 / 100.0) * amt;
        } else if (amt < 5000) {
            discount = (10.0 / 100) * amt;

        } else {
            discount = (15.0 / 100) * amt;
        }
        System.out.printf("%.2f", amt - discount);
        scan.close();

    }
}
