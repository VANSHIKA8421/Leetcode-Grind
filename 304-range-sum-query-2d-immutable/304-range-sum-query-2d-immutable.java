class NumMatrix 
{
    int[][] dp;
    public NumMatrix(int[][] matrix)
    {
        int row = 0;
        int column = 0;
        
        row = matrix.length;
        column = matrix[0].length;
        
        dp = new int[row+1][column+1];
        
        for(int i = 1; i < row+1 ; i++ )
        {
            for(int j = 1 ; j < column+1 ; j++)
            {
                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + matrix[i-1][j-1];
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) 
    {
        return dp[row2+1][col2+1] - dp[row2+1][col1] - dp[row1][col2+1] + dp[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 dp[i][j] = M[i-1][j-1] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
 */