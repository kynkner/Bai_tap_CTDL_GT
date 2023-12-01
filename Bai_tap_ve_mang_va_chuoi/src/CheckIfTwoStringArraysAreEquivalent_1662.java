public class CheckIfTwoStringArraysAreEquivalent_1662 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int[] nums1 = {555,901,482,1771};
        int result = findNumbers(nums);
        int result1 = findNumbers(nums1);

        System.out.println(result);
        System.out.println(result1);

    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        for(int num : nums){
            if (String.valueOf(num).length() % 2 == 0){
                result++;
            }
        }
        return  result;
    }
}
