package dynamic;

import java.util.HashMap;
import java.util.Map;

/**
 * 斐波拉契数列
 * https://leetcode-cn.com/problems/fibonacci-number/
 */
public class Leet509 {

    public static void main(String[] args) {
        System.out.println(fib3(2));
        System.out.println(fib3(3));
        System.out.println(fib3(4));
    }

    /**
     * 递归
     * 递归公式 f(n) = f(n - 1) + f(n - 2)
     * @param n
     * @return
     */
    public static int fib1(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib1(n - 1) + fib1(n - 2);
    }

    /**
     * 备忘录算法，记录已经计算过的值，下次直接查找
     * @param n
     * @return
     */
    public static int fib2(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        for (int i = 2; i <= n; i++) {
            int temp = map.get(i - 1) + map.get(i - 2);
            map.put(i,temp);
        }
        return map.get(n);
    }


    /**
     * 在备忘录算法上修改，只记录前两个的值（f(n -1) , f(n - 2)），其余的值不记录
     * @param n
     * @return
     */
    public static int fib3(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0,b = 1;
        int c = 0;
        // 这里从 1 开始，因为 f(1) 的值是已经有的，f(2) 只需要加一次，同理 f(3) 循环两次
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
