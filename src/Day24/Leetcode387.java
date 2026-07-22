package dailyproblems;

public class Leetcode387 {

    public static int firstUniqChar(String s) {

        int[] count = new int[26];

        // Count each character
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Find first character with count 1
        for (int i = 0; i < s.length(); i++) {

            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "leetcode";

        int result = firstUniqChar(s);

        System.out.println(result);
    }
}