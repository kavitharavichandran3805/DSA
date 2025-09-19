import java.util.ArrayList;
import java.util.List;

public class arrayWithStackOps {
    public static List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int index = 0;
        for (int i = 1; i <= n && index < target.length; i++) {
            System.out.println("i top: " + i);
            System.out.println("index top: " + index);
            if (target[index] == i) {
                System.out.println("if passed");

                result.add("Push");
                ++index;
            } else {
                for (int j = i; j < target[index]; j++) {
                    result.add("Push");
                    result.add("Pop");
                }
                i = target[index] - 1;
                System.out.println("i : " + i);
                System.out.println("index : " + index);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = { 1, 3 };
        int n = 3;
        System.out.println(buildArray(a, n));
    }
}