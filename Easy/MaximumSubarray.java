import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args){
        // #53
        int[] test = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(test));
        modifiedMaxSubArray(test);
    }
    private static int maxSubArray(int[] nums){
        int max = nums[0], currMax = nums[0];
        for(int i = 1; i < nums.length; i++){
            currMax = Math.max(currMax + nums[i], nums[i]);
            max = Math.max(max, currMax);
        }
        return max;
    }

    private static int modifiedMaxSubArray(int[] nums){
        int max = nums[0], currMax = nums[0];
        int l = 0, r = 0, temp = 0;
        for(int i = 1; i < nums.length; i++){
            currMax = Math.max(currMax + nums[i], nums[i]);
            if(nums[i] > (currMax + nums[i])) {
                temp = i;
            }
            max = Math.max(max, currMax);
            if(currMax > max) {
                l = temp;
                r = i;
            }
        }
        int[] subArr = Arrays.copyOfRange(nums, l, r);
        System.out.println(Arrays.toString(subArr) + " = " + max);
        return max;
    }
}