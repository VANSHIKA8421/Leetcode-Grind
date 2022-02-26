class Solution 
{
    public int climbStairs(int n) 
    {
        
        // MOST OPTIMISED SOLUTION
        
        
       int prev =1;
       int prev2 =1;
        int current = 0; 
        
        for(int i = 2 ; i <= n ; i++)
        {
           current = prev + prev2;
            prev2 = prev;
            prev = current;
            
        }
        return prev;
    }
}
// RECURSION TLE 
//          if(n==0) return 1;
//          if(n==1) return 1;
//          else return climbStairs(n-1)+climbStairs(n-2);

// CONVERTED RECURSION TO MEMOIZATION 
//         int[] dp = new int[n+1];
        
//         dp[0]=1;
//         dp[1]=1;
        
//         for(int i = 2 ; i <= n ; i++)
//         {
//             if(dp[i]==0)
//             {
//                 dp[i]=dp[i-1]+dp[i-2];
//             }
//         }
//         return dp[n];

