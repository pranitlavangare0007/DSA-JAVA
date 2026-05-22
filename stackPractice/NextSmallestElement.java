package stackPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextSmallestElement {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();

            }
            if (stack.isEmpty()) {
                ans.add(-1);
            } else {
                ans.add(stack.peek());
            }

            stack.push(arr[i]);
        }
        Collections.reverse(ans);
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(nextSmallerEle(new int[] { 4, 8, 5, 2, 25 }));
    }
}
