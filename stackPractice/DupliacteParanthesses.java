package stackPractice;

import java.util.Stack;

public class DupliacteParanthesses {
    
    public static boolean duplicateParen(String s){

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(ch == ')'){

                int count=0;

                while (stack.peek() != '(') {

                    stack.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }else{
                    stack.pop();
                }
            }else{
                stack.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s ="(((a+b)+(a+b)))";
        System.out.println(duplicateParen(s));
    }
}
