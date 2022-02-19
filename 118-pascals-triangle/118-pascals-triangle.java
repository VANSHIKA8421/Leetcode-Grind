class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> list = new ArrayList<>();
        
        if(numRows==0) return list;
        
        for(int i = 0 ; i < numRows ; i++)
        {
            List<Integer> ans = new ArrayList<>(i);
            for(int j =0 ; j < i + 1; j++ )
            {
                if(j==0||j==i)
                {
                    ans.add(1);
                }
                else
                {
                    int a = list.get(i-1).get(j-1);
                    int b = list.get(i-1).get(j);
                    ans.add(a+b);
                }
            }
            list.add(ans);
        }
        return list;
    }
}