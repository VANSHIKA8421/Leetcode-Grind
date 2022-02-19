class Solution
{
    public void setZeroes(int[][] matrix)
    {
        HashSet<Integer> set_x = new HashSet<>();
        HashSet<Integer> set_y = new HashSet<>();
        
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = 0 ; j < matrix[i].length ; j++)
            {
                if(matrix[i][j]==0)
                {
                    set_x.add(i);
                    set_y.add(j);
                }
            }
        }
        for(int i = 0 ; i < matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
            {
                if(set_x.contains(i) || set_y.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
                
        }
        
    }
}