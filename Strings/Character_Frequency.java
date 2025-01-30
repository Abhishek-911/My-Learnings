import java.util.HashMap;
import java.util.Map;

public class Character_Frequency {
    public static void main(String[] args) {
        String str = "Hello World";

        char arr[] = str.toCharArray();

        HashMap<Character,Integer> map1 = new HashMap<>();

        for(char element:arr){
            if(element!=' '){
                map1.put(element,map1.getOrDefault(element,0)+1);
            }
        }

        System.out.println("Frequency of each Character: ");
        for(Map.Entry<Character,Integer> entry : map1.entrySet()){
            System.out.println("Element: "+entry.getKey()+", Frequency: "+entry.getValue());
        }
    }
}
