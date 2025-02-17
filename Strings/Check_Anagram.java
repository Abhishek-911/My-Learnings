// import java.util.Arrays;

public class Check_Anagram{

    // public static boolean isAnagram(String str1,String str2){
    //     if(str1.length()!=str2.length()){
    //         return false;
    //     }
    //     char arr1[] = str1.toCharArray();
    //     char arr2[] = str2.toCharArray();
    //     Arrays.sort(arr1);
    //     Arrays.sort(arr2);
    //     if(Arrays.equals(arr1, arr2)){
    //         return true;
    //     }
    //     return false;
    // }

    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int count[] = new int[256];
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "study";
        String str2 = "dusty";
        boolean result = isAnagram(str1,str2);
        System.out.println(result);
    }
}