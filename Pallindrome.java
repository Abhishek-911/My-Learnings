//Palindrome Program in Java
import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int r,sum = 0;
        while(n>0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp==sum){
            System.out.println(temp+" is a Pallindrome Number");
        }
        else{
            System.out.println(temp+" is not a Pallindrome Number");
        }
    }
}
