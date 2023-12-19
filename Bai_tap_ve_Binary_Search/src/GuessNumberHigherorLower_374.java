public class GuessNumberHigherorLower_374 {
    public static void main(String[] args) {
        int n = 10; pick = 6;
        System.out.println(guessNumber(n));
        int n1 = 1; pick = 1;
        System.out.println(guessNumber(n1));
        int  n2 = 2; pick = 1;
        System.out.println(guessNumber(n2));
    }
    public static int guessNumber(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    private static int guess(int num) {
        if (num == pick){
            return 0;
        }else  if(num < pick){
            return 1;
        }else {
            return -1;
        }
    }
    private static int pick ;
}
