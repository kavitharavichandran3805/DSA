
public class spiral {
    public static void main(String[] args) {
        int n = 5;
        int rs = 0, re = n - 1;
        int cs = 0, ce = n - 1;
        int[][] r = new int[n][n];
        int val = 0;
        while (rs <= re && cs <= ce) {
            for (int i = cs; i <= ce; i++) {
                r[rs][i] = ++val;
            }
            for (int i = rs + 1; i <= re; i++) {
                r[i][ce] = ++val;
            }
            for (int i = ce - 1; i >= cs; i--) {
                r[re][i] = ++val;
            }
            for (int i = re - 1; i > rs; i--) {
                r[i][cs] = ++val;
            }
            ++rs;
            ++cs;
            --re;
            --ce;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
}
