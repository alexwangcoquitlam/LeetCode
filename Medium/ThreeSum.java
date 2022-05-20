package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {

    public static void main(String[] args) {
        // #15
        int[] nums = { 1, 2, -2, -1 };
        List<List<Integer>> res = threeSum(nums);
        System.out.println("break");
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        // find 2 sum that add to a value in the array
        if (nums.length <= 2) {
            return new ArrayList<List<Integer>>();
        }

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> temp = twoSum(nums, (-1) * nums[i], i);
            if (temp.size() == 3) {
                if (!checkContains(result, temp)) {
                    result.add(temp);
                }
            }
        }
        return result;
    }

    public static List<Integer> twoSum(int[] numbers, int target, int given) {
        List<Integer> result = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                if (i != given && map.get(target - numbers[i]) != given) {
                    result.add(numbers[i]);
                    result.add(numbers[map.get(target - numbers[i])]);
                    result.add(numbers[given]);
                    return result;
                }
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static boolean checkContains(List<List<Integer>> input, List<Integer> curr) {
        for (List<Integer> iterator : input) {
            if (iterator.containsAll(curr)) {
                return true;
            }
        }
        return false;
    }
}