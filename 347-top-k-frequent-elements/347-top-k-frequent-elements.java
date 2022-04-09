class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        
        
        int n = nums.length;
        List<Integer>[] bucket = new List[nums.length + 1];
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for( int i=0 ; i < n ; i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        for( int i : hm.keySet())
        {
            int freq = hm.get(i);
            
            if(bucket[freq]==null)
            {
                bucket[freq]=new ArrayList();
            }
            bucket[freq].add(i);

        }
        int[] ans = new int[k]; int count = 0;
        for(int i = bucket.length-1 ; i>=0 ; i--)
        {
            if (bucket[i] != null)
            {
                for(int j =0;  j <bucket[i].size()&& j<=k+1 ;j++)
                {
                     ans[count++] = bucket[i].get(j);
                }
            }
             if(count == k) break;
        }
        return ans;
    }
}