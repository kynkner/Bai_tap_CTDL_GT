import java.util.Arrays;

public class ThirdMaximumNumber_414 {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        int[] nums1 = {1,2};
        int[] nums2 = {2,2,3,1};

        System.out.println(thirdMax(nums));
        System.out.println(thirdMax(nums1));
        System.out.println(thirdMax(nums2));

    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int distinctCount = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                distinctCount++;
            }
            if (distinctCount == 3) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
