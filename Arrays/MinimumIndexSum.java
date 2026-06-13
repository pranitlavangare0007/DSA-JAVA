package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MinimumIndexSum {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        ArrayList<String> ans = new ArrayList<>();

        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                sum = map.get(list2[i]) + i;

                if (sum == minSum) {

                    ans.add(list2[i]);
                } else if (sum < minSum) {
                    ans.clear();
                    minSum = sum;
                    ans.add(list2[i]);
                }
            }

        }
        String[] finalAns = new String[ans.size()];
        for (int i = 0; i < finalAns.length; i++) {
            finalAns[i] = ans.get(i);
        }
        return finalAns;
    }

    public static void main(String[] args) {
        String list1[] = { "happy", "sad", "good" }, list2[] = { "sad", "happy", "good" };
        String ans[] = findRestaurant(list1, list2);

        for (String s : ans) {
            System.out.print(s + " ");
        }
    }
}
