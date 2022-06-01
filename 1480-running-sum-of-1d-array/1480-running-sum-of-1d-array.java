class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        int iterator = 1;
        int size = nums.length;
        for( iterator = 1; iterator < size ; iterator++)
        {
            nums[iterator] = nums[iterator]+nums[iterator-1];
        }
        return nums;
    }
}