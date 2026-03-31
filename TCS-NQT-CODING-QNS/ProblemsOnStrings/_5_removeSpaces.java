import java.util.Scanner;

public class _5_removeSpaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.replace(" ", "");
        System.out.println(s);
        scan.close();
    }
}
