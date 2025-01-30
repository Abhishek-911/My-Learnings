public class _9_All_Permutations {

    public static void findP(String str,String newString){
        if(str.length()==0){
            System.out.println(newString);
            return;
        }
        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            findP(newstr, newString+current);
        }
    }

   public static void main(String[] args) {
    String str = "abc";
    findP(str,"");
   } 
}
