public class Reverse_Each_Word {

    public static String Reverse_Word(String input) {
        String str = " "+input;
        String result = "";
        String temp = "";
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                result = temp + " " + result;
                temp = "";
            }else{
                temp = temp+str.charAt(i);
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String str = "Hello myself Abhishek";
        System.out.println(str);
        String result = Reverse_Word(str);
        System.out.println(result);
    }
}
