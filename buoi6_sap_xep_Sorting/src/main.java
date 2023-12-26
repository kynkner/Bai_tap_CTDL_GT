import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1,5 ,7 ,4,8 , 1};

    }

//    public static int[] MergeSort (int[] nums, int l, int r){
//        if (l == r){
//            return new int[] {nums [l]};
//        }
//        int mid = l + ( l -r) / 2;
//        int[] nums1 = MergeSort(nums, l, mid);
//        int[] nums2 = MergeSort(nums, mid + 1, r);
//
//
//
//    }
    public static int[] merge(int[] a1, int[] a2){
        int n = a1.length + a2.length;
        int[] nums = new int[n];

        int i = 0, i1 = 0, i2= 0;
        while ((i < n)) {

            if (i1< a1.length && i2 < a2.length){
                if (a1[i1] < a2[i2]){
                    nums[i] = a1[i1];
                    i++;
                    i1++;
                }else{
                    nums[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
            else {
                if(i1 < a1.length) {
                    nums[i] = a1[i1];
                    i++;
                    i1++;
                }

                if(i2 < a2.length) {
                    nums[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return nums;
    }
}
