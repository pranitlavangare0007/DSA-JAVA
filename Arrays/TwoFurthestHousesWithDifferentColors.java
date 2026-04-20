package Arrays;

public class TwoFurthestHousesWithDifferentColors {

    public static int maxDistance(int[] colors) {
        
        int maxDistanceFromLeft=Integer.MIN_VALUE;
        int maxDistanceFromRight=Integer.MIN_VALUE;

       int firstLeft=0;
       for(int i=1;i<colors.length;i++){
        if(colors[firstLeft] != colors[i]){
            int dist=Math.abs((firstLeft-i));
            maxDistanceFromLeft=Math.max(maxDistanceFromLeft, dist);
        }
       }

       int firstRight=colors.length-1;
       for(int j=colors.length-2;j>=0;j--){
        if(colors[firstRight] != colors[j]){
            int dist = Math.abs((firstRight-j));
            maxDistanceFromRight=Math.max(maxDistanceFromRight, dist);
        }
       }

        return Math.max(maxDistanceFromLeft, maxDistanceFromRight);
    }
    public static void main(String[] args) {
        int[] arr={0,1};
        System.out.println(maxDistance(arr));
        
    }
    
}
