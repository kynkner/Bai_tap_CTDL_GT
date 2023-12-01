import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class FirstUniqueCharacterInAString_387 {
    public static void main(String[] args) {
        String s = "leetcode";
        String s1 = "loveleetcode";
        String s2 = "aabb";

        System.out.println(firstUniqChar(s));
        System.out.println(firstUniqChar(s1));
        System.out.println(firstUniqChar(s2));

    }
    public static int firstUniqChar(String s) {
        int[] result = new int[26];

        for(char c : s.toCharArray()){
            result[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (result[s.charAt(i) - 'a'] == 1){
                return  i;
            }
        }
        return -1;
    }
}
