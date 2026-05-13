package ArrayListProblems;

import java.util.ArrayList;
import java.util.List;

public class MultiDimensionalArrayList {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
       

        int count=1;
        for(int i=0;i<3;i++){
          List<Integer> sub = new ArrayList<>();

          for(int j=0;j<5;j++){
            sub.add(count);
            count++;
          }
          list.add(sub);
        }
            System.out.println(list);
    }
    
}
