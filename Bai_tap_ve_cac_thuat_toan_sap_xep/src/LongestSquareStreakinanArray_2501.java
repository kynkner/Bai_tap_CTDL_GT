import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSquareStreakinanArray_2501 {
    public static void main(String[] args) {
        int[] nums = {4,3,6,16,8,2};
        int[] nums1 = {2,3,5,6,7};
        int[] nums2 = {2,2};
        int[] nums3 = {2, 4};

        System.out.println(longestSquareStreak(nums));
        System.out.println(longestSquareStreak(nums1));
        System.out.println(longestSquareStreak(nums2));
        System.out.println(longestSquareStreak(nums3));

    }
    public static int longestSquareStreak(int[] nums) {
        if (nums == null || nums.length < 2) {
            return -1;
        }

        Map<Integer, Integer> dp = new HashMap<>();
        int maxLength = -1;

        for (int num : nums) {
            dp.put(num, dp.getOrDefault(num, 0) + 1);

            for (int key : dp.keySet()) {
                if (key != num && dp.containsKey(key * key)) {
                    dp.put(num, Math.max(dp.get(num), dp.get(key * key) + 1));
                }
            }

            maxLength = Math.max(maxLength, dp.get(num));
        }

        return maxLength >= 2 ? maxLength : -1;
    }
}
