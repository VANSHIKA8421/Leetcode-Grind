class Solution 
{
    public boolean searchMatrix(int[][] nums, int target) 
    {
        // i = row
        // j = column 
        int rows = nums.length-1;
        int columns = nums[0].length -1;
        int i = 0;
        int j = nums[0].length-1;
        while(i>=0 && i<=rows && j>= 0 && j<= columns)
        {
            int num = nums[i][j];
            if(num==target)
            {
                return true;
            }
            else if( num > target )
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
}
// i have started checking from top right 