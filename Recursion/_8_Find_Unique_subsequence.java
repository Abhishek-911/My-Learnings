import java.util.HashSet;

public class _8_Find_Unique_subsequence {

    public static void findUnique(String str, int index, HashSet<String> set1, String newString) {
        if (index == str.length()) {
            if (set1.contains(newString)) {
                return;
            } else {
                set1.add(newString);
                System.out.println(newString);
                return;
            }
        }
        char ch = str.charAt(index);

        findUnique(str, index + 1, set1, newString + ch);

        findUnique(str, index + 1, set1, newString);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set1 = new HashSet<>();
        findUnique(str, 0, set1, "");
    }

}
