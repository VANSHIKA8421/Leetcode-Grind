class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        //hare and tortoise method
        
        int hare = 0;
        int tortoise = 0;
        
        do
        {
            hare = nums[hare];
            tortoise= nums[nums[tortoise]];
        }
        while(hare!=tortoise);
        
        hare = 0;
        while(hare!=tortoise){
            tortoise=nums[tortoise];
            hare=nums[hare];
        }
        return hare;
    }
}
// sort and compare next

// store all the elements from 1 to n and then check the count 

// hashset can be used if set.contains(nums[i]) the retun nums[i]

// hare and tortoise method
