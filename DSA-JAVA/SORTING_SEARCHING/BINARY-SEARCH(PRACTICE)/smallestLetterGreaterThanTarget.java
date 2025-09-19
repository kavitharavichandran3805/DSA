public class smallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] a = { 'c', 'd', 'f' };
        char t = 'd';
        System.out.println(findSmallestLetter(a, t));

    }

    public static char findSmallestLetter(char[] a, char t) {
        int s = 0, e = a.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] > t) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return a[(s % a.length)];
    }
}
