import java.util.Arrays;

public class _10_Unique_Paths {

    // public static int findPath(int m,int n){
    // if(m==0 && n==0){
    // return 1;
    // }else if(m<0 || n<0){
    // return 0;
    // }else{
    // int left = findPath(m, n-1);
    // int up = findPath(m-1, n);
    // return left+up;
    // }
    // }

    public static int findPath(int m, int n, int[][] dp) {
        if (m == 0 || n == 0) {
            return 1;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        dp[m][n] = findPath(m - 1, n, dp) + findPath(m, n - 1, dp);
        return dp[m][n];
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int dp[][] = new int[m][n];
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
        int total = findPath(m - 1, n - 1, dp);
        System.out.println(total);
    }
}
