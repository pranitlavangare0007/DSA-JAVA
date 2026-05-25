package QueueProblems;

import java.util.LinkedList;
import java.util.Queue;

public class InterLeaveTwoHalfOFQueue {

    public static void  interLeaveTwoHalf(Queue<Integer> q){
        Queue<Integer> temp = new LinkedList<>();
        int n=q.size();
        
        for(int i=0;i<n/2;i++){
            temp.add(q.remove());
        }

        while (!temp.isEmpty()) {
            q.add(temp.remove());
            q.add(q.remove());
            
            
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        System.out.println(q);
        interLeaveTwoHalf(q);
        System.out.println(q);


    }
}
