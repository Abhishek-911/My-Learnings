public class _11_Set_Tiles {

    public static int countWays(int m,int n){
        if(m==n){
            return 2;
        }
        if(m<n){
            return 1;
        }
        int horizontal = countWays(m-n, n);
        int vertical = countWays(m-1, n);
        return horizontal+vertical;
    }

    public static void main(String[] args) {
        int m = 4, n = 2;
        int result = countWays(m,n);
        System.out.println(result);
    }
}