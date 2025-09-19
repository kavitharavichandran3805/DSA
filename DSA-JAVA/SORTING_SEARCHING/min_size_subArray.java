public class min_size_subArray {
    public static void main(String[] args) {
        int a[] = {};
        int sum = 0;
        int target = 7;
        int start = 0;
        int end = 0;
        for (int num : a) {
            start = Math.max(start, num);
            end += num;
        }
        while(start<end){
            
        }
    }
}
