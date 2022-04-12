package Easy;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main (String[] args){
        int[] arr = {1,1,1,1,2,2,2,2,3,3,3,3,5,5,5,5,6,6,11,11,12,12,12,100,100};
        removeDuplicates(arr);
    }

    private static int removeDuplicates(int[] nums){
        int n = nums.length;
        int counter = 0;
        int temp;
        for(int i = 0; i < n-1;){
            temp = nums[i];
            i++;
            while(nums[i] == temp){
                nums[i] = Integer.MIN_VALUE;
                if((i+1) != n)
                    i++;
            }
        }
        for(int i = 0; i < n; i++){
            if(nums[i] != Integer.MIN_VALUE){
                temp = nums[counter];
                nums[counter] = nums[i];
                nums[i] = temp;
                counter++;
            }
        }
        return counter;
    }
}
