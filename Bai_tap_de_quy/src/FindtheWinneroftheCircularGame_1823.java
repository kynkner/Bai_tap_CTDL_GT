import java.util.LinkedList;

public class FindtheWinneroftheCircularGame_1823 {
    public static void main(String[] args) {
        int n = 5; int k = 2;
        int n1 = 6; int k1 = 5;

        System.out.println(findTheWinner(n, k));
        System.out.println(findTheWinner(n1, k1));
    }
    public static int findTheWinner(int n, int k) {
        LinkedList<Integer> you = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            you.add(i);
        }

        int count = 0;

        while (you.size() > 1) {
            count = (count + k - 1) % you.size();
            you.remove(count);
        }

        return you.get(0);
    }

}
