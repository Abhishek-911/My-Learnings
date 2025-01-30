import java.util.ArrayList;

public class _13_subsets {

    public static void printSubsets(int n,ArrayList<Integer> list){
        if(n==0){
            for(int i:list){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        list.add(n);
        printSubsets(n-1, list);

        list.remove(list.size()-1);
        printSubsets(n-1, list);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();
        printSubsets(n,list);
    }
}
