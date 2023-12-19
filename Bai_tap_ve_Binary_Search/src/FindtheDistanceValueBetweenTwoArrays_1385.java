public class FindtheDistanceValueBetweenTwoArrays_1385 {
    public static void main(String[] args) {
        int[] arr1 = {4,5,8}; int[] arr2 = {10,9,1,8}; int d = 2;
        int[] arr11 = {1,4,2,3}; int[] arr22 = {-4,-3,6,10,20,30}; int d1 = 3;
        int[] arr111 = {2,1,100,3}; int[] arr222 = {-5,-2,10,-3,7}; int d2 = 6;

        System.out.println(findTheDistanceValue(arr1, arr2, d));
        System.out.println(findTheDistanceValue(arr11, arr22, d1));
        System.out.println(findTheDistanceValue(arr111, arr222, d2));
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt = 0, n = arr1.length;
        for (int i = 0; i < n; i++) {
            if (check(arr1[i], arr2, d)) cnt++;
        }
        return cnt;
    }
    private static boolean check(int x, int[] a, int d) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (Math.abs(x - a[i]) <= d) return false;
        }
        return true;
    }
}
