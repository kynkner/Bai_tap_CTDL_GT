import java.util.Arrays;

public class SortColors_75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int[] nums1 = {2,0,1};

        sortColors(nums);
        sortColors(nums1);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums1));
    }
    public static void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = nums.length - 1;

        while (white <= blue){
            if (nums[white] == 0){
                int temp = nums[red];
                nums[red] = nums[white];
                nums[white] = temp;
                red++;
                white++;
            }else if(nums[white] == 1){
                white++;
            }else {
                int temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue--;
            }
        }
    }
}
