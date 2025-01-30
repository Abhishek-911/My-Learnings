import java.util.Stack;

public class Valid_Parenthesis {

    public static boolean isPar(String str){
        Stack<Character> stk = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch=='(' || ch=='{' || ch=='['){
                stk.push(ch);
            }else if(
                (!stk.isEmpty() && stk.peek()=='(' && ch==')') ||
                (!stk.isEmpty() && stk.peek()=='{' && ch=='}') ||
                (!stk.isEmpty() && stk.peek()=='[' && ch==']')
            ){
                stk.pop();
            }else{
                return false;
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{()}[]{";
        if(isPar(str)){
            System.out.println("Valid Parenthesis");
        }else{
            System.out.println("Invalid Parenthesis");
        }
    }
}
