class Solution 
{
    public boolean canAttendMeetings(int[][] intervals) 
    {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int a = 0;
        int b = 1; int n = intervals.length;
        while(a < n && b < n)
        {
            if(intervals[a][1]>intervals[b][0])
            {
                return false;
            }
            else
            {
                a++;
                b++;
            }
        }
         return true;
    }
}