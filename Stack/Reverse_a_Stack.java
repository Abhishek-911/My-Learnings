import java.util.Stack;

public class Reverse_a_Stack {

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();

        reverse(s);

        pushToBottom(s,top);
    }

    public static void pushToBottom(Stack<Integer> s,int element){
        if(s.isEmpty()){
            s.push(element);
            return;
        }

        int top = s.pop();

        pushToBottom(s, element);

        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
    
        System.out.println("Original Stack: "+s);

        
        reverse(s);

        System.out.println("After reversing the Stack: "+s);
    }
}
