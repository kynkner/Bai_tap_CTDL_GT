public class NumberofGoodPairs_1512 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 1, 3};
        int[] nums1 = {1, 1, 1, 1};
        int[] nums2 = {1, 2, 3};
        System.out.println(numIdenticalPairs(nums));
        System.out.println(numIdenticalPairs(nums1));
        System.out.println(numIdenticalPairs(nums2));
    }
    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length + 1;
        int[] array = new int[n]; // Số lớn nhất trong mảng nums là 100

        for (int num : nums) {
            // Đếm tần suất xuất hiện của từng số trong mảng
            array[num]++;
        }

        int count = 0;
        for (int i : array) {
            // Số cặp tốt cho mỗi số là C(n, 2) = n * (n - 1) / 2
            count += i * (i - 1) / 2;
        }

        return count;
    }
}
