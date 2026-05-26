package QueueProblems;

import java.util.LinkedList;
import java.util.Queue;


public class TimeNeededToByATicket {
     public static int timeRequiredToBuy(int[] tickets, int k) {
     Queue<int[]> q = new LinkedList<>();

     for(int i=0;i<tickets.length;i++){
        q.add(new int[]{tickets[i],i});
     }

     int time=0;

     while (!q.isEmpty()) {
        int[] person=q.remove();
        person[0]--;
        time++;

        if(person[0] == 0 && person[1] ==k){
            return time;
        }

        if(person[0] > 0){
            q.add(person);
        }

        
     }
     return time;
    }
    public static void main(String[] args) {
        int[] tickets = {2,3,2};
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets, k));
    }
}
