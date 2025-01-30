public class RotateOrNot {

    public static boolean Rotate_Check(String str1,String str2){
        if(str1.length()==0 || str2.length()==0){
            return false;
        }
        if(str1.length()!=str2.length()){
            return false;
        }
        String concat = str1+str1;
        if(concat.contains(str2)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "dabc";
        if(Rotate_Check(str1,str2)){
            System.out.println("Given strings are rotation of each other");
        }else{
            System.out.println("Given Strings are not rotation of each other");
        }
    }
}
