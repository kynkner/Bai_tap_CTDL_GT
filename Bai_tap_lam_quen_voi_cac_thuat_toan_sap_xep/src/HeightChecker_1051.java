import java.util.Arrays;

public class HeightChecker_1051 {
    public static void main(String[] args) {
        int[] s =  {1,1,4,2,1,3};
        int[] s1 = {5,1,2,3,4};
        int[] s2 = {1,2,3,4,5};

        System.out.println(heightChecker(s));
        System.out.println(heightChecker(s1));
        System.out.println(heightChecker(s2));


    }
    public static int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}
