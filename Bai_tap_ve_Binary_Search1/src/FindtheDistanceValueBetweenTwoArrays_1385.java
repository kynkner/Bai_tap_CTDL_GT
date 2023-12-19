public class FindtheDistanceValueBetweenTwoArrays_1385 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12}; int target = 9;
        int[] nums1 = {-1,0,3,5,9,12}; int target1 = 2;

        System.out.println(search(nums, target));
    }
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
