package Easy;

public class BinarySearch {
    // #704
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, target, nums.length - 1, 0);
    }

    public static int binarySearch(int[] nums, int target, int high, int low){
        if(high >= low){
            int pivot = (int)Math.ceil((high-low)/2)+low;
            if(nums[pivot] == target){
                return pivot;
            }
            else if(nums[pivot] > target){
                return binarySearch(nums, target, pivot-1, low);
            }
            else if(nums[pivot] < target){
                return binarySearch(nums, target, high, pivot+1);
            }
        }
        
        return -1;
    }
}
