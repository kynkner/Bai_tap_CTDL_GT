import java.util.Arrays;

public class DuplicateZeros_1089 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        int[] arr1 = {1,2,3};

        duplicateZeros(arr);
        duplicateZeros(arr1);
    }
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;

        int count = 0;
        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }

        int index = n + count - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                if (index < n) {
                    arr[index] = 0;
                }
                index--;
            }

            if (index < n) {
                arr[index] = arr[i];
            }
            index--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
