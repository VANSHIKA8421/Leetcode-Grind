class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int max_sum = Integer.MIN_VALUE;
        int running_sum = 0;
        for(int i = 0 ;i < nums.length ; i++)
        {
            running_sum=running_sum+nums[i];
            max_sum=Math.max(max_sum,running_sum);
            if(running_sum<0) running_sum=0;
            
        }
        return max_sum;
    }
}