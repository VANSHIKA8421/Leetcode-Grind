class Solution 
{
    public void sortColors(int[] nums) 
    {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        
        while(mid<=right){
        if(nums[mid]==0)
        {
            swap(mid,left,nums);
            mid++;
            left++;
        }
        else if(nums[mid]==1)
        {
            mid++;
        }
        else
        {
            swap(mid,right,nums);
            right--;
        }}
    }
    void swap(int mid, int left, int[] nums)
    {
        int temp = nums[left];
        nums[left]=nums[mid];
        nums[mid]=temp;
    }
}
