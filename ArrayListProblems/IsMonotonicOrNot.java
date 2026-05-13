package ArrayListProblems;

import java.util.ArrayList;
import java.util.List;

public class IsMonotonicOrNot {
    

    public static boolean isMonotonicOrNot(List<Integer> arr){

        boolean isInc=true;
        boolean isDec = true;

        for(int i=0;i<arr.size()-1;i++){

            if(arr.get(i) > arr.get(i+1)){
                isInc=false;
            }
            if(arr.get(i) < arr.get(i+1)){
                isDec=false;
            }
        }

       
        return isDec || isInc;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(isMonotonicOrNot(list));
    
    }
}
