class Solution 
{
    public int lengthOfLIS(int[] nums) 
    {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int i = 0; int j = 1;
        while(j<n)
        {
            while(i<j)
            {
                if(nums[j]>nums[i] && dp[j] < dp[i] + 1)
                {
                    dp[j]=dp[j]+1;
                }
                i++;
            }
            i=0;
            j++;
        }
        int max = Integer.MIN_VALUE;
        for( int a : dp)
        {
            if(a>max)
            {
                max=a;
            }
        }
        return max;
    }
}