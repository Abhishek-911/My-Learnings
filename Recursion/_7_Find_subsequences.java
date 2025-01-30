public class _7_Find_subsequences {

    public static void Find(String str, int index, String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char ch = str.charAt(index);

        Find(str, index+1, newString+ch);
        
        Find(str, index+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        Find(str,0,"");
    }
}
