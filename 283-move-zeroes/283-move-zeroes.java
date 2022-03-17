class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int k = 0;
        int count = 0;
        for(int i = 0 ;i < nums.length; i++)
        {
            if(nums[i]==0)
            {
                count++;
            }
            else
            {
                nums[k]=nums[i];
                k++;
            }
        }
        int i = nums.length-1;
        while(count>=0&&k<nums.length)
        {
            nums[i]=0;
            i--;
            k++;
        }
    }
}