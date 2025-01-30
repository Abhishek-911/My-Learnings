public class Remove_char {

    public static String remove(String str){
        String result = str.replaceAll("[^a-zA-Z0-9]", "");
        // String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        // for(int i=0;i<str.length();i++){
        //     String c = str.charAt(i)+"";
        //     if(alphabets.contains(c)){
        //         result = result+c;
        //     }
        // }

        return result;
    }

    public static void main(String[] args) {
        String str = "@^^^^Hello****World))))90099";
        System.out.println(str);
        String result = remove(str);
        System.out.println(result);
    }
}
