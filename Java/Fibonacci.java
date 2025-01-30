public class Fibonacci {

    // public void generate(int n){
    //     if(n==0){
    //         System.out.println("1");
    //         return;
    //     }
    //     if(n==1){
    //         System.out.println("1");
    //         return;
    //     }
    //     int a = 0;
    //     int b = 1;
    //     System.out.print(a+" "+b+" ");
    //     for(int i=3;i<=n;i++){
    //         int sum = a+b;
    //         System.out.print(sum+" ");
    //         a = b;
    //         b = sum;
    //     }
    // }

    public int generate(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return generate(n-1)+generate(n-2);
    }

    public static void main(String[] args) {
        Fibonacci f1 = new Fibonacci();
        // f1.generate(10);
        for(int i=0;i<10;i++){
            System.out.print(f1.generate(i)+" ");
        }
    }
}
