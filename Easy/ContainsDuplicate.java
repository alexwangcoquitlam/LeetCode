package Easy;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main (String[] args){
        // #217 Contains Duplicate
        int[] test = {1,2,3,4};
        System.out.println(containsDuplicate(test));
    }

    private static boolean containsDuplicate(int[] nums){
        HashSet set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                return true;
            }
        }

        return false;
    }
}
