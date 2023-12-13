import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SortArraybyIncreasingFrequency_1636 {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 2, 2, 3};
        int[] result1 = frequencySort(nums1);
        System.out.println(Arrays.toString(result1));

        int[] nums2 = {2, 3, 1, 3, 2};
        int[] result2 = frequencySort(nums2);
        System.out.println(Arrays.toString(result2));

        int[] nums3 = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        int[] result3 = frequencySort(nums3);
        System.out.println(Arrays.toString(result3));

    }
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> frequencyMap = new TreeMap<>();

        // Đếm tần suất xuất hiện của mỗi số
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Sắp xếp mảng dựa trên tần suất và giá trị của các số


        return nums;
    }
}
