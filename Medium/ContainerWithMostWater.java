package Medium;

public class ContainerWithMostWater{
    public static void main(String[] args){
        // #11
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height){
        int max = 0;
        int left = 0, right = height.length-1;
        while(right > left){
            max = Math.max(max, Math.min(height[left], height[right]) * (right-left));
            if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return max;
    }

    public static int maxAreaSquared(int[] height){
        int max = 0;

        for(int i = 0; i < height.length; i++){
            for(int j = i; j < height.length; j++){
                max = Math.max(max, Math.min(height[i], height[j])*(j-i));
            }            
        }
        return max;
    }
}