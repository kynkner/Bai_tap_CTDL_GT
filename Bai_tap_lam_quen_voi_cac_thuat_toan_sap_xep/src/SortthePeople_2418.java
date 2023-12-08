import java.util.Arrays;

public class SortthePeople_2418 {
    public static void main(String[] args) {
        String[] name = {"Mary","John","Emma"}; int[] Heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(name, Heights)));
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;

        String[][] arrays = new String[n][2];
        for (int i = 0; i < n; i++) {
            arrays[i][0] = names[i];
            arrays[i][1] = String.valueOf(heights[i]);
        }
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf(arrays[i][j]+" ");
            }
        }
        Arrays.sort(arrays, (a, b) -> Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1])));

        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {
            sortedNames[i] = arrays[i][0];
        }

        return sortedNames;
    }
}
