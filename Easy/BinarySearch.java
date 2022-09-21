package Easy;

public class BinarySearch {
    // #704
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target){
        int left = 0, right = nums.length-1;
        int pivot = right/2;
        while(left <= right){
            if(nums[pivot] == target){
                return pivot;
            }
            else{
                if(nums[pivot] > target){
                    right = pivot-1;
                    pivot = left+(right-left)/2;
                }
                else {
                    left = pivot+1;
                    pivot = left+(right-left)/2;
                }
            }
        }
        return -1;
    }
}
