import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
    int[] nums = {6, 7, 8, 5, 4, 1, 2, 3};
    Arrays.sort(nums);
    quickSort(nums, 0 , nums.length - 1);
    System.out.println(Arrays.toString(nums));
    }


    static void quickSort(int[] nums, int l, int r) {
        if(l >= r) {
            return;
        }
        int pi = partitionCenterPivot(nums, l, r);
        quickSort(nums, l, pi - 1);
        quickSort(nums, pi, r);

    }

    static int partitionCenterPivot (int[] nums, int l, int r) {
        int pValue = nums[l + (r-l)/2];
        int iL = l, iR = r;

        while(iL <= iR) {
            while (nums[iL] < pValue) iL++;
            while(nums[iR] > pValue) iR--;

            if(iL <= iR) {
                swap(nums, iL, iR);
                iL++;
                iR--;
            }
        }

        return iL;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
