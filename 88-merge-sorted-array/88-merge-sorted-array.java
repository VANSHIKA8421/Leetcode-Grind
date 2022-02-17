class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int len = nums1.length -1;
  
    int i = m-1, j = n-1;
    while(i>=0 && j>=0 && i < m && j < n){
        
        if(nums1[i] >= nums2[j]){
            nums1[len--] = nums1[i--];
        }else{
            nums1[len--] = nums2[j--];
        }
    }
    
    while(i>=0 && i< m){
        nums1[len--] = nums1[i--];
    }
    
    while(j>=0 && j< n){
        nums1[len--] = nums2[j--];
    }
    return;
    }
}
// create a new array of size m+n then use 2 pointer approach to insert sorted numbers in array 
// TC o(m+n) SC O(m+n)

// create m+n new array insert all emements and Arrays.sort
// TC o(n)+o(m)+(m+n)log(m+n) SC o(m+n)


// use two pointer approach one pointer in nums1 other in nums2 compare both elements if the element of nums 1 is > that of nums 2 swap and then sort nums 2 after insertion of a new element 

// gap method insertion sort 
// TC (m+n)log(m+n) because we are dividing the gap by 2 so logarithmic 

