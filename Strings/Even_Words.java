public class Even_Words {

    public static void printEven(String input){
        String str = input + " ";
        String temp = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                if(temp.length()%2==0){
                    System.out.print(temp+" ");
                }
                temp = "";
            }else{
                temp = temp + str.charAt(i);
            }
        }
    }

    public static void main(String[] args) {
        String str = "Below is the implementation of the above approach";
        printEven(str);
    }
}
