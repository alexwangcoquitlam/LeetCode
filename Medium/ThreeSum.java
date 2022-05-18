package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum{

    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = threeSum(nums);
        System.out.println("break");
    }

    public static List<List<Integer>> threeSum(int[] nums){
        //find 2 sum that add to a value in the array
        if(nums.length <= 2){
            return new ArrayList<List<Integer>>();
        }

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i = 0; i < nums.length; i++){
            List<Integer> temp = twoSum(nums, (-1)*nums[i]);
            if(temp.size() == 2 && !temp.contains(i)){
                temp.add(nums[i]);
                if(!checkContains(result, temp)){
                    result.add(temp);
                }
            }
        }
        return result;
    }

    public static List<Integer> twoSum(int[] numbers, int target){
        List<Integer> result = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result.add(numbers[i]);
                result.add(numbers[map.get(target - numbers[i])]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static boolean checkContains(List<List<Integer>> input, List<Integer> curr){
        for(List<Integer> iterator : input){
            if(iterator.containsAll(curr)){
                return true;
            }
        }
        return false;
    }
}