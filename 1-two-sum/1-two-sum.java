class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] ans = new int[2];
       int lol = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++)
        {
            int num = target - nums[i];
            if(!map.containsKey(num))
            {
                map.put(nums[i],i);
            }
            else
            {
                ans[0]=i;
             
                lol=map.get(target-nums[i]);
                
                ans[1]=lol;
                
            }
        }
        return ans;
    }
}