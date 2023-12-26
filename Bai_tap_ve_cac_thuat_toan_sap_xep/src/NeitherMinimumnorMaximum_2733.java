import java.util.Arrays;

public class NeitherMinimumnorMaximum_2733 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,4};
        int[] nums1 = {1,2};
        int[] nums2 = {2,1,3};

        System.out.println(findNonMinOrMax(nums));
        System.out.println(findNonMinOrMax(nums1));
        System.out.println(findNonMinOrMax(nums2));
    }
    public static int findNonMinOrMax(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        return Math.max(Math.min(Math.max(nums[0], nums[1]),nums[2]), Math.min(nums[0],nums[1]));
    }
}
