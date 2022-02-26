class Solution 
{
    public int climbStairs(int n) 
    {
        int[] dp = new int[n+1];
        
        dp[0]=1;
        dp[1]=1;
        
        for(int i = 2 ; i <= n ; i++)
        {
            if(dp[i]==0)
            {
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
}
// RECURSION TLE 
//          if(n==0) return 1;
//          if(n==1) return 1;
//          else return climbStairs(n-1)+climbStairs(n-2);