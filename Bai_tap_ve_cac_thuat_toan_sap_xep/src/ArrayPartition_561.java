import java.util.Arrays;

public class ArrayPartition_561 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int[] nums1 = {6, 2, 6, 5, 1, 2};

        System.out.println(arrayPairSum(nums));
        System.out.println(arrayPairSum(nums1));
    }
    public static int arrayPairSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        short[] count = new short[max - min + 1];
        for (int num : nums) {
            count[num - min]++;
        }
        int result = 0;
        int rem = 1;
        for(int i=0; i < count.length; i++) {
            short c = count[i];
            if (c != 0) {
                int cr = c + rem;
                rem = cr & 1;
                result += (i + min) * (cr >>> 1);
            }
        }
        return result;
    }
}
