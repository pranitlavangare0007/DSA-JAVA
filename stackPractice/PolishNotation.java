package stackPractice;

import java.util.Stack;

public class PolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (String token : tokens) {

            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                s.push(Integer.parseInt(token));

            } else {
                int num2 = s.pop();
                int num1 = s.pop();

                switch (token) {
                    case "+":
                        s.push(num1 + num2);
                        break;
                    case "-":
                        s.push(num1 - num2);
                        break;
                    case "*":
                        s.push(num1 * num2);
                        break;
                    case "/":
                        s.push(num1 / num2);
                        break;

                }
            }

        }
        return s.pop();
    }

    public static void main(String[] args) {
        String str[] = { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(str));
    }
}
