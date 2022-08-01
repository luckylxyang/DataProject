package dynamic;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode198 {

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,7,9,3,1}));
    }

    public static int rob(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int length = nums.length;
        if(length == 1){
            return nums[0];
        }
        if(length == 2){
            return Math.max(nums[0],nums[1]);
        }
        if(length == 2){
            return Math.max(nums[0],nums[1]);
        }

        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for(int i = 2; i < length; i++){
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];

    }
}
