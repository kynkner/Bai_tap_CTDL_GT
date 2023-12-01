public class RunningSumof1dArray_1480 {
    public static void main(String[] args) {

                int[] nums1 = {12, 345, 2, 6, 7896};
                int[] nums2 = {555, 901, 482, 1771};

                System.out.println(result(nums1));
                System.out.println(result(nums2));
            }
    public static int result(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (check(num)) {
                count++;
            }
        }
        return count;
    }
    public static boolean check(int num) {
        int digitCount = 0;
        while (num > 0) {
            num /= 10;
            digitCount++;
        }
        return digitCount % 2 == 0;
    }


       
}


