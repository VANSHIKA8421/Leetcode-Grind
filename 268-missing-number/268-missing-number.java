class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int sum=0;
        for(int i = 0 ; i < nums.length;i++)
        {
            sum=sum+nums[i];
        }
        int actual_sum = nums.length*(nums.length+1)/2;
        return actual_sum-sum;
    }
}
// HashMap with count 

// hashset with all the elements then keep popping 

//use math
// 1 + 2 + 3 = 6
// 3+ 1 = 4