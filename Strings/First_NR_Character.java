import java.util.LinkedHashMap;
import java.util.Map;

public class First_NR_Character {

    public static char findFirst(String str) {
        if(str.length()==0){
            throw new RuntimeException("String is Empty");
        }

        Map<Character, Integer> map1 = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        throw new RuntimeException("Did not find any Non-Repeated Character");
    }

    public static void main(String[] args) {
        String str = "aabbbbccefgh";
        char result = findFirst(str);
        System.out.println(result);
    }
}
