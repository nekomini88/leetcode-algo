package array;

public class BinarySearchFindPosition {
//    public int[] searchRange(int[] nums, int target) {
//        // 左闭右闭区间
//        int[] array = new int[nums.length];
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                array[count] = i;
//                count++;
//            } else continue;
//        }
//        if (array.length == 0 || count== 0) {
//            return new int[]{-1, -1};
//        }
//        return new int[]{array[0], array[count-1]};
//    }


    public int[] searchRange(int[] nums, int target) {
        int left = findLeft(nums, target);
        if (left == -1) {
            return new int[]{-1, -1};
        }
        int right = findRight(nums, target);
        return new int[]{left, right};
    }

    private int findLeft(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    ans = mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return ans;
    }

    private int findRight(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                if (nums[mid] == target) {
                    ans = mid;
                }
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        BinarySearchFindPosition sol = new BinarySearchFindPosition();
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int[] res1 = sol.searchRange(nums1, 8);
        System.out.println(java.util.Arrays.toString(res1)); // [3,4]

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int[] res2 = sol.searchRange(nums2, 6);
        System.out.println(java.util.Arrays.toString(res2)); // [-1,-1]

        int[] nums3 = {};
        int[] res3 = sol.searchRange(nums3, 0);
        System.out.println(java.util.Arrays.toString(res3)); // [-1,-1]
    }
}

