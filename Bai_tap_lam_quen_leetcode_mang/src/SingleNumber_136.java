public class SingleNumber_136 {
    public static void main(String[] args) {
        int [] nums = {2,2,1};
        int [] nums1 = {4,1,2,1,2};
        int [] nums2 = {1};

        int result = singleNumber(nums);
        int result1 = singleNumber(nums1);
        int result2 = singleNumber(nums2);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
