public class CheckIfTwoStringArraysAreEquivalent_1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"}; String[] word2 = {"a", "bc"};
        String[] word11 = {"a", "cb"}; String[] word22 = {"ab", "c"};
        String[] word111  = {"abc", "d", "defg"}; String[] word222 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(word1, word2));
        System.out.println(arrayStringsAreEqual(word11, word22));
        System.out.println(arrayStringsAreEqual(word111, word222));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = String.join("", word1);
        String str2 = String.join("", word2);

        return str1.equals(str2);
    }
}
