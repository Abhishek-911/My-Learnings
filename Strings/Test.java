public class Test {
    public static void main(String[] args) {
        String str = "Java Programming";
        int total = str.length();
        int a = str.replaceAll("a","").length();
        System.out.println(total-a);
    }
}
