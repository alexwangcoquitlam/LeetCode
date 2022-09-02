package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        // #1 Two Sum
        int[] test = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(test, target)));
    }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        HashMap map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                result[0] = (int) map.get(target-nums[i]);
                result[1] = i;
            }
            else{
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
