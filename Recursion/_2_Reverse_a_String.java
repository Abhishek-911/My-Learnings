public class _2_Reverse_a_String {

    public static void Reverse(String str,int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        Reverse(str, index-1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        Reverse(str,str.length()-1);
    }
}
