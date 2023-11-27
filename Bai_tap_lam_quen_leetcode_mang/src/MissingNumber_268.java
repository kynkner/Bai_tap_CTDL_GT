public class MissingNumber_268 {
    public static void main(String[] args) {
        int [] nums = {3,0,1};
        int [] nums1 = {0,1};
        int [] nums2 = {9,6,4,2,3,5,7,0,1};

        int result = missingNumber(nums);
        int result1 = missingNumber(nums1);
        int result2 = missingNumber(nums2);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int Sum = n * (n + 1) / 2;
        int Sum1 = 0;

        for (int num : nums) {
            Sum1 += num;
        }

        return Sum - Sum1;
    }
}
