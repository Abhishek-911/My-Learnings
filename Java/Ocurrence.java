public class Ocurrence {
    public static void main(String[] args) {
        String str = "Java Programming";
        int totalcount = str.length();
        int total_a_count = str.replaceAll("a", "").length();
        int count = totalcount-total_a_count;
        System.out.println("The ocurrence of Character a is: "+count);
    }
}
