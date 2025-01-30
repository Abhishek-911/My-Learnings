public class Remove_space {
    public static void main(String[] args) {
        String str = "    Hello    World   ";
        System.out.println(str);
        System.out.println(str.trim());
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
