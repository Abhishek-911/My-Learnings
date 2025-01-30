public class _6_Remove_Duplicates {

    public static void RemoveDups(String str,int index,String newString){
        if(index == str.length()){
            System.out.println("The String without duplicates is: "+newString);
            return;
        }
        String ele = "" + str.charAt(index);
        if(!newString.contains(ele)){
            newString += ele;
        }
        RemoveDups(str, index+1, newString);
    }

    public static void main(String[] args) {
        String str = "abxxbccxxxda";
        System.out.println("The String with duplicates is: "+str);
        RemoveDups(str, 0, "");
    }
}
