package Day10;

public class Day10program3 {

    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Day10program3 obj = new Day10program3();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Output: " + obj.maxSubArray(nums));
    }
}