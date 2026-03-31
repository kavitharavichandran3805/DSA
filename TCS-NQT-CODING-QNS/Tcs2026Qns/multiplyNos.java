//multiply all numbers except zero

import java.util.Scanner;

public class multiplyNos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().trim().split(",");
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("0")) {
                continue;
            }
            product *= Integer.valueOf(arr[i]);
        }
        System.out.println(product);
        scan.close();
    }
}
