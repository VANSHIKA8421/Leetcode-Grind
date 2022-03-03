class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int j = 0;
        
        int[] ans = new int[2];
        
        
        int low = 0;
        
        int index1 = 0; int index2 = 0;
        
        int high = numbers.length-1;
        int mid = 0;
        
        for(int i = 0 ; i < numbers.length ; i++)
        {
            j = target - numbers[i];
            index1=i;
            low = i+1;
            while(low <= high)
            {
                 mid = low+(high - low)/2;
                System.out.println(mid);
                if(numbers[mid]==j)
                {
                    index2 = mid;
                    ans[0]=index1+1;
                    ans[1]=index2+1;
                    return ans;
                }
                else if(numbers[mid]<j)
                {
                    low = mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }
            low = numbers.length-1;
        }
       
        return ans;
    }
}
// -1 0 2 7 11 15 20 22
//     i + j = target 
//     j = target + 1 
//     j = 10