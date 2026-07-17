package Day10;

public class Day10program2 {

    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = String.valueOf(num).length();

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Day10program2 obj = new Day10program2();

        int[] nums = {12, 345, 2, 6, 7896};

        int result = obj.findNumbers(nums);

        System.out.println("Output: " + result);
    }
}

