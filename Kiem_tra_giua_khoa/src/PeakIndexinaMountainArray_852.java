public class PeakIndexinaMountainArray_852 {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int[] arr1 = {0,2,1,0};
        int[] arr2 = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
        System.out.println(peakIndexInMountainArray(arr1));
        System.out.println(peakIndexInMountainArray(arr2));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Chưa đạt đỉnh, tiếp tục tìm ở bên phải
                left = mid + 1;
            } else {
                // Đã vượt qua đỉnh hoặc ở đỉnh, tiếp tục tìm ở bên trái
                right = mid;
            }
        }

        // khi left và right đã hội tụ thì left hoặc right là chỉ số đỉnh
        return left;
    }
}
