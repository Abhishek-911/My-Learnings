public class Reverse_String {

    public static String Reverse(String input){
        String result = "";
        for(int i=input.length()-1;i>=0;i--){
            result = result + input.charAt(i);
        }
        return result;
    }

    public static String Reverse2(String input){
        input = " " + input;
        String result = "";
        String temp = "";
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)==' '){
                result = result + " " + temp;
                temp = "";
            }else{
                temp = input.charAt(i)+temp;
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String str = "Hello myself Abhishek";
        System.out.println(str);
        String result = Reverse(str);
        String result2 = Reverse2(str);
        System.out.println(result);
        System.out.println(result2);
    }
}
