package QueueProblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversefirstKofaQueue {
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        
        Queue<Integer> result = new LinkedList<>();

        Stack<Integer> stack = new Stack<>();
       
        for(int i=0;i<k;i++){
            stack.add(q.remove());
        }

      

            while (!stack.isEmpty()) {
                result.add(stack.pop());
                
            }
            while (!q.isEmpty()) {
                result.add(q.remove());
                
            }
            
        

        return result;
        
    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println(reverseFirstK(q, 3));
    }
}
