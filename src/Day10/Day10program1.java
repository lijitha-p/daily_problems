package Day10;

public class Day10program1 {

    public boolean canAliceWin(int[] nums) {
        int sumSingle = 0, sumDouble = 0, totalSum = 0;

        for (int num : nums) {
            totalSum += num;

            if (num < 10) {
                sumSingle += num;
            } else {
                sumDouble += num;
            }
        }

        return (sumSingle > totalSum - sumSingle)
                || (sumDouble > totalSum - sumDouble);
    }

    public static void main(String[] args) {
        Day10program1 obj = new Day10program1();

        int[] nums = {1, 2, 10, 20};

        boolean result = obj.canAliceWin(nums);

        System.out.println(result);
    }
}