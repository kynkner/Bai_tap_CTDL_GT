public class FibonacciNumber_509 {
    public static void main(String[] args) {
        int n = 2;
        int n1 = 3;
        int n2 = 4;

        System.out.println(fib(n));
        System.out.println(fib(n1));
        System.out.println(fib(n2));

    }
    public static int fib(int n) {
        if(n  <= 1){
            return n;
        }else{
           return fib(n -1) + fib(n-2);
        }
    }
}
