import java.util.Arrays;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] nums1 = {0};

        moveZeroes(nums);
        moveZeroes(nums1);
    }
    public static void moveZeroes(int[] nums) {

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
