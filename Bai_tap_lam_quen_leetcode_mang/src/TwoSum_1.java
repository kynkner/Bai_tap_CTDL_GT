import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15}; int target = 9;
        int [] nums1 = {3,2,4}; int target1 = 6;
        int [] nums2 = {3,3}; int target2 = 6;

        int[] result = twoSum(nums, target);
        int[] result1 = twoSum(nums1, target1);
        int[] result2 = twoSum(nums2, target2);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> num = new HashMap<>();

        for ( int i = 0; i < nums.length; i++ ) {
            int number = target - nums[i];
            if (num.containsKey(number)){
                return new  int[]{num.get(number), i};
            }
            num.put(nums[i], i);
        }
        return null;
    }
}
