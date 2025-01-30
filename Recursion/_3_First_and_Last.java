public class _3_First_and_Last {

    public static int first = -1;
    public static int last = -1;

    public static void printPosition(String str, int index, char ele) {
        if (index == str.length()) {
            System.out.println("Character '" + ele + "' first appearance at position: " + first);
            System.out.println("Character '" + ele + "' last appearance at position: " + last);
            return;
        }
        if (str.charAt(index) == ele) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        printPosition(str, index + 1, ele);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        char ele = 'h';
        printPosition(str, 0, ele);
    }
}
