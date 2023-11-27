public class MajorityElement_169 {
    public static void main(String[] args) {
        int [] nums = {3,2,3};
        int [] nums1 = {2,2,1,1,1,2,2};

        int result = majorityElement(nums);
        int result1 = majorityElement(nums1);

        System.out.println(result);
        System.out.println(result1);
    }
    public static int majorityElement(int[] nums) {
        int total = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                total = num;
                count = 1;
            } else if (num == total) {
                count++;
            } else {
                count--;
            }
        }

        return total;
    }
}
