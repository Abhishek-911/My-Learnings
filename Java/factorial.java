public class factorial {

    // public static int factorial(int n){
    //     int result=1;
    //     while(n>0){
    //         result = result*n;
    //         n = n-1;
    //     }
    //     return result;
    // }

    public static int factorial(int n){
        if(n==0 ||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = factorial(n);
        System.out.println(result);
    }
}
