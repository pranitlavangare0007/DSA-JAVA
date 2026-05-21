package stackPractice;

import java.util.Stack;

public class StackPrcatice {

    public static Stack<Integer> addAtFirst(Stack<Integer> stack , int val){

        if(stack.isEmpty()){
            stack.push(val);
            return stack;
        }

       
        int data = stack.pop();
       Stack<Integer> newStack = addAtFirst(stack, val);
       newStack.push(data);

        return newStack;

    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(addAtFirst(stack, 4) );
    }
}
