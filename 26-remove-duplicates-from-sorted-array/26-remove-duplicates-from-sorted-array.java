class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int k = 1;
        int n = nums.length;
        if(k>=n) return n;
        
        int i = 1;
        int j = 1;
        int count = 1;
        
        while(j<n)
        {
            if(nums[j]!=nums[j-1])
            {
                count = 1;
                nums[i++]=nums[j];
            }
            else
            {
                if(count < k)
                {
                    nums[i++]=nums[j];
                    count++;
                }
            }
            j++;
        }
        return i;
    }
}