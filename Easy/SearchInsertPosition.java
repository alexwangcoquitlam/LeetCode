public class SearchInsertPosition {
    public static void main (String[] args){
        // #35
        int[] input = {1,3,5,6};
        System.out.println(searchInsert(input, 2));
    }

    private static int searchInsert(int[] nums, int target){
        return binarySearch(nums, 0, nums.length-1, target);
    }

    private static int binarySearch(int[] nums, int l, int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == x)
                return mid;

            if (nums[mid] > x)
                return binarySearch(nums, l, mid - 1, x);

            return binarySearch(nums, mid + 1, r, x);
        }
        return l;
    }
}
