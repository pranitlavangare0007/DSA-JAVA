package Arrays;

public class TrappingRainWater {

    public static int trappingRainWater(int[] arr){

int[] leftBounds = new int[arr.length];
int[] rightBounds = new int[arr.length];

leftBounds[0]=arr[0];
for(int i=1;i<arr.length;i++){
    
    leftBounds[i]=Math.max(arr[i],leftBounds[i-1]);
}
rightBounds[rightBounds.length-1]=arr[arr.length-1];
for(int i=arr.length-2;i>=0;i--){
    
    rightBounds[i]=Math.max(arr[i], rightBounds[i+1]);
}

int trappedWater=0;

for(int i=0;i<arr.length;i++){
    int waterLevel= Math.min(leftBounds[i],rightBounds[i]);
    trappedWater += waterLevel-arr[i];

}


return trappedWater;

    }
    public static void main(String[] args) {
        int[] heights={4,2,0,6,3,2,5};
        System.out.println(trappingRainWater(heights));
    }
    
}
