public class PowerofThree_326 {
    public static void main(String[] args) {
        int n = 27;
        int n1 = 0;
        int n2 = -1;
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
        boolean isPowerOfThree = true;

        if (n <= 0) {
            isPowerOfThree = false;
        } else {
            while (n > 1) {
                if (n % 3 != 0) {
                    isPowerOfThree = false;
                    break;
                }
                n /= 3;
            }
        }
        return isPowerOfThree;
    }
}
