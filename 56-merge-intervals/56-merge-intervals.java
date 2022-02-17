class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        if(intervals.length==0||intervals.length==1)
        {
            return intervals;
        }
        
        ArrayList<int[]> ans = new ArrayList<>();
        
        Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
    
        
        int[] current_interval = intervals[0];
        
        ans.add(current_interval);
        
       for( int[] arr : intervals)
       {
           int current_start = current_interval[0];
           int current_end = current_interval[1];
           
           int next_start = arr[0];
           int next_end = arr[1];
           
           if(current_end>=next_start)
           {
               current_interval[1]=Math.max(current_end,next_end);
           }
           else
           {
               current_interval=arr;
               ans.add(current_interval);
           }
       }
        return ans.toArray(new int[ans.size()][]);
    }
}