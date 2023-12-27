public class Happy_Number_202 {
    public static void main(String[] args) {
        int n = 19;
        int n1 = 2;
        System.out.println(isHappy(n));
        System.out.println(isHappy(n1));

    }
    public static boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }

        return n == 1;
    }
}
