import java.util.Arrays;

public class SortanArray_912 {
    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int[] nums1 = {5,1,1,2,0,0};

        System.out.println(Arrays.toString(sortArray(nums)));
        System.out.println(Arrays.toString(sortArray(nums1)));
    }
    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);

        return nums;
    }

    static void quickSort(int[] nums, int l, int r) {
        if(l >= r) {
            return;
        }

        int[] pi = partitionDualPivot(nums, l, r);
        quickSort(nums, l, pi[0] - 1);
        quickSort(nums, pi[0] + 1, pi[1] - 1);
        quickSort(nums, pi[1] + 1, r);
    }

    static int[] partitionDualPivot (int[] nums, int l, int r) {
        if(nums[l] > nums[r]) {
            swap(nums, l, r);
        }

        int piL = nums[l];
        int piR = nums[r];

        int i = l + 1;
        int j = r - 1;

        int k = l + 1;
        while( k <= j) {
            if(nums[k] < piL) {
                swap(nums, i, k);
                i++;
            } else if (nums[k] >= piR) {
                while(nums[j] > piR && j > k) {
                    j--;
                }
                swap(nums, k, j);
                j--;

                if(nums[k] < piL) {
                    swap(nums, i, k);
                    i++;
                }
            }
            k++;
        }

        i--;
        swap(nums, i, l);
        j++;
        swap(nums, j, r);

        return new int[] {i, j};
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
