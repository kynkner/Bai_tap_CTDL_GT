import java.util.Arrays;

public class ShuffletheArray_1470 {
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7}; int n = 3;
        int [] nums1 = {1,2,3,4,4,3,2,1}; int n1 = 4;
        int [] nums2 = {1,1,2,2}; int n2 = 2;

        int[] result = shuffle(nums, n);
        int[] result1 = shuffle(nums1, n1);
        int[] result2 = shuffle(nums2, n2);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            result[total++] = nums[i];
            result[total++] = nums[i + n];
        }

        return result;
    }
}
