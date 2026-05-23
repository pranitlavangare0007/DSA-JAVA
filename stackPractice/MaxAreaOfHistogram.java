package stackPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MaxAreaOfHistogram {
    static int[] nextSmallerEleRight(int[] arr) {

       int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();

            }
            if (stack.isEmpty()) {
                ans[i]=arr.length;
            } else {
                ans[i]=stack.peek();
            }

            stack.push(i);
        }
        
        return ans;

    }
    static int[] nextSmallerEleLeft(int[] arr) {

       int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();

            }
            if (stack.isEmpty()) {
                ans[i]=-1;
            } else {
                ans[i]=stack.peek();
            }

            stack.push(i);
        }
        
        return ans;

    }

     public static int largestRectangleArea(int[] heights) {
        int nsl[]=nextSmallerEleLeft(heights);
        int nsr[]=nextSmallerEleRight(heights);

        int max=0;
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=nsr[i]-nsl[i]-1;
            int area=height*width;
            max=Math.max(max, area);
        }
        return max;
    }
    
    public static void main(String[] args) {
        
        int arr[]={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));

    }
}
