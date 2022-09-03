package Medium;

import java.time.temporal.Temporal;
import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args){
        // #167 two sum 2 - input array is sorted
        int[] numbers = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target){
        int[] result = new int[2];
        int left = 0, right = numbers.length-1;
        while(left < right){
            int temp = numbers[left] + numbers[right];
            if(temp == target){
                result[0] = left+1;
                result[1] = right+1;
                break;
            }
            else if(temp > target){
                right--;
            }
            else {
                left++;
            }
        }
        return result;
    }
}
