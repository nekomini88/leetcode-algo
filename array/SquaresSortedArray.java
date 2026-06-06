package array;

public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        int [] results = new int[nums.length];
        int index = nums.length - 1;
        for (int i = 0, j = nums.length - 1; i <= j; ) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                results[index] = nums[i] * nums[i];
                index--;
                i++;
            } else {
                results[index] = nums[j] * nums[j];
                index--;
                j--;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        SquaresSortedArray squaresSortedArray = new SquaresSortedArray();
        System.out.println(squaresSortedArray.sortedSquares(new int[]{-4,-1,0,3,10}));
    }
}
