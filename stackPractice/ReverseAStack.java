package stackPractice;

import java.util.Stack;

public class ReverseAStack {
    public static Stack<Integer> addAtBottom(Stack<Integer> stack , int val){

        if(stack.isEmpty()){
            stack.push(val);
            return stack;
        }

       
        int data = stack.pop();
       Stack<Integer> newStack = addAtBottom(stack, val);
       newStack.push(data);

        return newStack;

    }
    public static Stack<Integer> reverseStack(Stack<Integer> s){

        if(s.isEmpty()){
           return s;
        }

        int data = s.pop();
       
       reverseStack(s);
       addAtBottom(s, data);
        
     
      
       return s;
        
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(reverseStack(stack));
    }
}
