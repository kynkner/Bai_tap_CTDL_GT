public class FindthePunishmentNumberofanInteger_2698 {
    public static void main(String[] args) {
        for (int i = 1 ; i < 1001; i++) {
            System.out.println(i +"="+(i*i + 1 ) +"="+ punishmentNumber(i));
            // mỗi khi punishmentNumber(i) thay đổi thì sẽ điều kiện của nó và là kết quả
            // ví dụ như i từ 1 đến 8 là 1 thì điều kiện là if(n< 9) = 1
        }
    }
    public static int punishmentNumber(int n) {
        int res = 0;
        while(n > 0) {
            if(digit(n*n,0,n)) res += n * n;
            n--;
        }
        return res;
    }
    private static boolean digit(int a, int b, int target) {
        if(a + b == target) return true;
        int d = 10;
        while(a / d != 0) {
            int remaning = a / d;
            int removed = a % d;
            if(digit(remaning,b+removed,target)) return true;
            d *= 10;
        }
        return false;
    }

}
