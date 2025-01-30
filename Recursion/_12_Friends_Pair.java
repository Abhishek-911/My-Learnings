public class _12_Friends_Pair {

    public static int pairsPossible(int n){
        if(n<=1){
            return 1;
        }
        int ways1 = pairsPossible(n-1);
        int ways2 = (n-1)*pairsPossible(n-2);

        return ways1+ways2;
    }

    public static void main(String[] args) {
        int n = 4;
        int result = pairsPossible(n);
        System.out.println(result);
    }
}
