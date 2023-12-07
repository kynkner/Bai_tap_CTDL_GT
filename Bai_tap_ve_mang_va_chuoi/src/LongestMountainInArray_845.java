public class LongestMountainInArray_845 {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        String s1 = "RLRRRLLRLL";
        String s2 = "LLLLRRRR";

        System.out.println(balancedStringSplit(s));
        System.out.println(balancedStringSplit(s1));
        System.out.println(balancedStringSplit(s2));
    }
    public static int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L') {
                balance++;
            } else if (c == 'R') {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
}
