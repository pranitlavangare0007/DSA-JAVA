package ArrayListProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonelyNumber {
    public static List<Integer> lonely(List<Integer> list){
        List<Integer> res = new ArrayList<>();

        Collections.sort(list);
        for(int i=0;i<list.size();i++){
        
            boolean isleftDiff = (i==0) || (list.get(i) -1 > list.get(i-1));
            boolean isRightDiff = (i == list.size()-1) || (list.get(i) + 1 < list.get(i+1));

            if(isRightDiff && isleftDiff){
                res.add(list.get(i));
            }
            
        }
        return res;
    }
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(lonely(list));
    }
}
