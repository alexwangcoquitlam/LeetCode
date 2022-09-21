package Medium;

public class Search2DMatrix {
    public static void main(String[] args){
        // #74 Search a 2D Matrix
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int arrLength = matrix[0].length;
        for(int i = 0; i < matrix.length; i++){
            if(target >= matrix[i][0] && target <= matrix[i][arrLength-1]){
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] nums, int target){
        int left = 0, right = nums.length-1;
        int pivot = right/2;
        while(left <= right){
            if(nums[pivot] == target){
                return true;
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
        return false;
    }
}
