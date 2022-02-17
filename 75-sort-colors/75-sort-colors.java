class Solution 
{
    public void sortColors(int[] nums) 
    {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while(mid<=right)
        {
            if(nums[mid]==0)
            {
                swap(mid,left,nums);
                mid++;
                left++;
            }
            else if( nums[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(mid,right,nums);
                right--;
            }
        }
    }
    public void swap(int left, int right, int[] nums)
    {
        int temp = 0;
        temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }
}

// public void swap(int[] nums, int i, int j) 
// {
// 	int temp = nums[i];
// 	nums[i] = nums[j];
// 	nums[j] = temp;
// }

// Arrays.sort();

// counting sort

// [ 0, 0, 1, 1, 2, 2 ]


// [ 2, 0, 2, 1, 1, 0 ]


//  0's |            | 2's 
//   | travelling 


// nums[travelling]==0 || nums[travelling]==2
// nums[i] is either 0, 1, or 2.

/// [ 0, 0, 1, 1, 2, 2 ]
//             T
//          0  2


// if nums[travelling]==0
// swaps(nums[travelling],nums[0])
// 0++ travelling++

// if nums[travelling]==2
// swaps(nums[travelling],nums[0])
// 2--

// if nums[travelling]==1
// travelling++