import java.util.Stack;

public class Push_at_bottom {

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

        int pushelement = 0;
        pushToBottom(s,pushelement);

        System.out.println("After insertion of "+pushelement+" : "+s);
    }
}