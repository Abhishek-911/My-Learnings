//Fibonacci series in Java
import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int n1 = -1;
        int n2 = 1;
        int n3;
        for(int i=0;i<=n;i++){
            n3 = n1+n2;
            System.out.println(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}