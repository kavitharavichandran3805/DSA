public class magic_number {
    public static void main(String[] args) {
        int n = 5;
        int base = 5;
        int ans = 0, last;
        while (n > 0) {
            last = n & 1;
            ans += last * base;
            base *= 5;
            n = n >> 1;
        }
        System.out.println(ans);
    }
}
// int n=4,last,pos=1,ans=0;
// while(n>0){
// last=n&1;
// ans+=(last*Math.pow(5,pos));
// n=n>>1;
// ++pos;

// }
// System.out.println(ans);