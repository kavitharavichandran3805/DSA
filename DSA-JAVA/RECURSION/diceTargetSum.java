import java.util.ArrayList;

public class diceTargetSum {
    public static void main(String[] args) {
        int target = 6;
        dice("", target);
        ArrayList<String> output = diceList("", target);
        System.out.println(output);
        int count = getCount("", target);
        System.out.println(count);
    }

    public static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    public static ArrayList<String> diceList(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            result.addAll(diceList(p + i, target - i));
        }
        return result;
    }

    public static int getCount(String p, int target) {
        if (target == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            count = count + getCount(p + i, target - i);
        }
        return count;
    }
}
