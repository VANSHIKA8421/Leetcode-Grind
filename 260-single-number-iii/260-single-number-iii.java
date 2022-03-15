class Solution 
{
    public int[] singleNumber(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
               // elem  // count
        int[] ans = new int[2]; int j = 0;
        for(int i = 0 ; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        
        for( int i : map.keySet())
        {
            if(map.get(i)==1)
            {
                ans[j]=i;
                j++;
            }
        }
        return ans;
    }
}