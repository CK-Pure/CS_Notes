public class ClimbStairs {
    public static int climbStairs(int n){
        if (n==1){
            return 1;
        }
        //多定义一位，考虑起始位置
        int []dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <=n ; i++) {
            dp[n]=dp[n-1]+dp[n-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int solution=climbStairs(3);
        System.out.println(solution);
    }
}
