import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; int m = 3; int[] nums2 = {2,5,6}; int n = 3;
        int[] nums11 = {1}; int m2 = 1; int[] nums22 = {}; int n2 = 0;
        int[] nums111 = {0}; int m3 = 0; int[] nums222 = {1}; int n3 = 1;

        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
        System.out.println(Arrays.toString(merge(nums11, m2, nums22, n2)));
        System.out.println(Arrays.toString(merge(nums111, m3, nums222, n3)));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
