package greedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class ActivistySelection {
    public static int activitySelection(int[] start, int[] finish) {

        if (start.length != finish.length)
            return -1;
        int[][] activites = new int[start.length][3];

        for(int i=0;i<start.length;i++){
            activites[i][0]=i;
            activites[i][1]=start[i];
            activites[i][2]=finish[i];
        }

        Arrays.sort(activites,Comparator.comparingDouble(o -> o[2]));
        int res = 1;
        int lastCount = activites[0][2];

        for (int i = 1; i < start.length ; i++) {

            if (activites[i][1] >= lastCount) {

                res++;
                lastCount = activites[i][2];

            }

        }

        return res;

    }

    public static void main(String[] args) {
        int start[] = { 10, 12, 20 }, end[] = { 20, 25, 30 };
        System.out.println(activitySelection(start, end));
    }
}
