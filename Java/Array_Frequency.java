import java.util.HashMap;
import java.util.Map;

public class Array_Frequency {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,4,5};

        HashMap<Integer,Integer> map1 = new HashMap<>();

        for(int element:arr){
            map1.put(element, map1.getOrDefault(element,0)+1);
        }

        System.out.println("Frequency of each Element: ");
        for(Map.Entry<Integer,Integer> entry : map1.entrySet()){
            System.out.println("Element: "+entry.getKey()+", Frequency: "+entry.getValue());
        }
    }
}
