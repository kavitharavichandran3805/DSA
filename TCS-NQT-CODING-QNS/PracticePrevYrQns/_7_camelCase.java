import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.util.*;

//ThisIsGood to "this is good"

public class _7_camelCase {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(input.charAt(0)));
        for (int i = 1; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                sb.append(" ");
            }
            sb.append(Character.toLowerCase(input.charAt(i)));
        }
        System.out.println(sb.toString());

    }
}
