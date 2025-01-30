public class Count_Words {

    //Brute-Force Approach
    public static int Count_Words(String input){ 
        String str = input + " ";
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }

    //Optimal Approach
    // public static int Count_Words(String input){
    //     String arr[] = input.split(" ");
    //     int count = arr.length;
    //     return count;
    // }

    public static void main(String[] args) {
        String str = "Hello Myself Abhishek I am from PKD";
        int count = Count_Words(str);
        System.out.println(count);
    }
}
