package Arrays;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            int area = width * Math.min(height[left], height[right]);

            max=Math.max(max, area);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
           

        }

        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,1 };
        System.out.println(maxArea(height));
    }
}
