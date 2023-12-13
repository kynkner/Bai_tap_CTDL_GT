public class ReverseString_344 {
    public static void main(String[] args) {
        char[] s2 = {'a'};
        char[] s = {'h','e','l','l','o'};
        char[] s1 = {'H','a','n','n','a','h'};

        reverseString(s2, 0, s2.length - 1);
        System.out.println(s2);
    }
    public static void reverseString(char[] s, int left, int right) {
        if (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            reverseString(s, left + 1, right - 1);
        }
    }
}
