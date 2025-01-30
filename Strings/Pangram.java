import java.util.HashSet;

public class Pangram{

    public static boolean isPangram(String str){
        if(str.length()==0){
            return false;
        }
        str = str.toLowerCase();

        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                set.add(ch);
            }
        }

        return set.size()==26;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        if(isPangram(str)){
            System.out.println("'"+str+"' is a Pangram");
        }else{
            System.out.println("'"+str+"' is not a Pangram");
        }
    }
}