import java.util.Arrays;

public class RemoveElement_27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3}; int val = 3;
        int[] nums1 = {0,1,2,2,3,0,4,2}; int val1 = 2;

        int result = removeElement(nums, val);
        int result1 = removeElement(nums1, val1);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums1));
    }

    public static int removeElement(int[] nums, int val) {
       int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
