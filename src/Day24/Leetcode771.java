package dailyproblems;

public class Leetcode771 {

    public static int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        for (char stone : stones.toCharArray()) {

            if (jewels.indexOf(stone) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        int result = numJewelsInStones(jewels, stones);

        System.out.println(result);
    }
}