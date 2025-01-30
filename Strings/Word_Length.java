public class Word_Length {

    public static void Count(String input) {
        if(input.length()==0){
            System.out.println("String is Empty!");
            return;
        }
        String str = input + " ";
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.println(temp + "->" + temp.length());
                temp = "";
            }else{
                temp = temp + str.charAt(i);
            }
        }
    }

    public static void main(String[] args) {
        String str = "Hello myself Abhishek";
        Count(str);
    }
}
