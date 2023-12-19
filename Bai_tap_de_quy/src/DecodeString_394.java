public class DecodeString_394 {
    public static void main(String[] args) {
        num = 0;
        String s = "3[a]2[bc]";
        String result = decodeString(s);
        System.out.println(result);

        num = 0;
        String s1 = "3[a2[c]]";
        String result1 = decodeString(s1);
        System.out.println(result1);

        num = 0;
        String s2 = "2[abc]3[cd]ef";
        String result2 = decodeString(s2);
        System.out.println(result2);

    }
    public static String decodeString(String s) {

        StringBuilder result = new StringBuilder();

        while (num < s.length() && s.charAt(num) != ']')
            if (Character.isDigit(s.charAt(num))) {
                int count = 0;
                while (num < s.length() && Character.isDigit(s.charAt(num)))
                    count = count * 10 + (s.charAt(num++) - '0');
                ++num;
                final String decodedString = decodeString(s);
                ++num;
                while (count-- > 0)
                    result.append(decodedString);
            } else {
                result.append(s.charAt(num++));
            }

        System.out.println(num);

        return result.toString();
    }

    private static int num = 0;

}
