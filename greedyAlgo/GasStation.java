package greedyAlgo;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        
        int curr=0;
        int prev =0;
        int start=0;

        for(int i=0;i<gas.length;i++){

            curr += gas[i];
            curr -= cost[i];

            if(curr < 0){
                prev += curr;
                curr = 0;
                start= i+1;
            }
        }
        return curr + prev >= 0 ? start:-1;
    }
    public static void main(String[] args) {
        int gas[]={1,2,3,4,5} , cost[]={3,4,5,1,2};

        System.out.println(canCompleteCircuit(gas, cost));
    }
}
