package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {

    public static void main(String[] args) {
        // #15 3Sum
        int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        List<List<Integer>> res = threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++){
            if(!(i > 0 && nums[i] == nums[i-1])){
                int left = i+1, right = nums.length-1;
                int target = -1*nums[i];
                while(left < right){
                    if(nums[left] + nums[right] == target){
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left-1]) left++;
                        while(left < right && nums[right] == nums[right+1]) right--;
                    }                    
                    else if(nums[left] + nums[right] < target) {
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }

        return result;
    }
}