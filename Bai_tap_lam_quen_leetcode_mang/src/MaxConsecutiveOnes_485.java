public class MaxConsecutiveOnes_485 {
    public static void main(String[] args) {
        int [] nums = {1,1,0,1,1,1};
        int [] nums1 = {1,0,1,1,0,1};

        int result = findMaxConsecutiveOnes(nums);
        int result1 = findMaxConsecutiveOnes(nums1);

        System.out.println(result);
        System.out.println(result1);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int total = 0;

        for (int num : nums) {
            if (num == 1) {
                total++;
                count = Math.max(count, total);
            } else {
                total = 0;
            }
        }

        return count;
    }
}
