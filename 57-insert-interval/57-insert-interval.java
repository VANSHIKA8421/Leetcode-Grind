class Solution 
{
    // we can classify all the kind of intervals in 3 types
    // all the intervals occuring before the new interval
    // intervlas whose stand and end points can be merged eith new interval
    // all the intervals occuring after end 
    
    public int[][] insert(int[][] intervals, int[] newInterval) 
    {
        ArrayList<int[]> list = new ArrayList<>();
        int i = 0;
        
        while(i<intervals.length&&intervals[i][1]<newInterval[0])
        {
            list.add(intervals[i]);
            i++;
        }
        while(i<intervals.length&&intervals[i][0]<=newInterval[1])
        {
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        list.add(newInterval);
        while(i<intervals.length)
        {
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[list.size()][]);
    }
}
// List<int[]> result = new ArrayList<>();
// int index = 0;
// // Add all non-overlapping intervals before the 'newSpan'
// while (index < intervals.length && intervals[index][1] < newSpan[0]) {
// 	result.add(intervals[index++]);
// }
// // Merge all overlapping intervals into the newSpan
// while (index < intervals.length && intervals[index][0] <= newSpan[1]) {
// 	int[] thisSpan = intervals[index++];
// 	newSpan[0] = Math.min(thisSpan[0], newSpan[0]);
// 	newSpan[1] = Math.max(thisSpan[1], newSpan[1]);

// }
// result.add(newSpan);  // return the merged newspan

// // Add all remaining non-overlapping intervals after the merged newSpan
// while (index < intervals.length) {
// 	result.add(intervals[index++]);
// }

// return result.toArray(new int[result.size()][]);