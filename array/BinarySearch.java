package array;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * 给定一个按升序排列的整数数组 nums 和一个整数 target，编写一个函数在 nums 中搜索 target。如果 target 存在，则返回其下标；否则返回 -1。
 *
 *  你必须编写一个时间复杂度为 O(log n) 的算法。
 */
public class BinarySearch {

//    public int search(int[] nums, int target) {
//        // 定义当前区间 [left,right]
//        int left = 0;
//        int right = nums.length -1;
//        int middle = 0 ;
//
//        while (left < right) {
//            middle = (left + right) /2 ;
//            if(nums[middle] > target){
//                right = middle - 1;
//            } else if (nums[middle] < target) {
//                left = middle + 1 ;
//            } if(nums[middle] == target) {
//                return middle;
//            }
//        }
//        return -1;
//    }

    public int search(int[] nums, int target) {
        // 定义当前区间 [left,right)
        int left = 0;
        int right = nums.length;
        int middle = 0 ;

        while (left < right) {
            middle = (left + right) /2 ;
            if(nums[middle] > target){
                right = middle;
            } else if (nums[middle] < target) {
                left = middle + 1 ;
            } if(nums[middle] == target) {
                return middle;
            }
        }
        return -1;
    }
}
