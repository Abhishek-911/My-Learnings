import java.util.HashSet;

public class Test1{
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(4);
        set1.add(3);
        set1.add(2);
        for(int a:set1){
            System.out.println(a);
        }
    }
}