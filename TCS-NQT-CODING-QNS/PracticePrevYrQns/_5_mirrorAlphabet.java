import java.io.*;

//  A -> Z, B -> Y
public class _5_mirrorAlphabet {
    public static void main(String[] args) throws Exception {
        // System.out.print((char) ('A' + (90 - 'A')));
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        for (char ch : input.toCharArray()) {
            System.out.print((char) ('A' + (90 - ch)));
        }

    }
}