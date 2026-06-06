package array;

public class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
        }
//        int ans = -1;
//        for (int i = 0; i <  nums.length; i++) {
//            if(nums[i] <= target){
//                ans = i;
//            }
//        }
//        return ans+1;
        return left;
    }
}
