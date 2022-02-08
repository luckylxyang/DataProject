package dynamic;

/**
 * 第 N 个泰波那契数
 * https://leetcode-cn.com/problems/n-th-tribonacci-number/
 *
 * f(n) = f(n - 1) + f(n - 2) + f(n - 3)
 */
public class Leet1137 {

    public static void main(String[] args) {
        System.out.println(fib(4));
        System.out.println(fib(25));
    }

    private static int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;

        int a = 0, b = 1, c = 1;
        int t = 0;
        for (int i = 2; i < n; i++) {
            t = a + b + c;
            a = b;
            b = c;
            c = t;
        }
        return t;
    }
}
