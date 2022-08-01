package dynamic;

/**
 * 爬楼梯
 *
 * https://leetcode-cn.com/problems/climbing-stairs/
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 这和斐波那契数列一样递归公式 f(n) = f(n - 1) + f(n -2)
 */
public class LeetCode70 {

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    private static int climbStairs(int n) {

        int a = 1;
        int b = 2;
        if(n == 1) return a;
        if(n == 2) return b;
        int c = 0;
        for(int i = 2; i < n; ++i){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
