class Solution 
{
    public long[] sumOfThree(long num) 
    {
        long[] ans = new long[3];
        long a = (num-3)/3;
        System.out.println(a);
        long tot = 0;
        for(int i = 0; i < ans.length; i++)
        {
           
            ans[i]=a;
            tot=tot+ans[i];
            a++;
        }
        if(tot==num)
            return ans;
        else
            return new long[0];
    }
}
// n/2[2a + (n − 1) × d] = num
// 3[2*a + 2] = 2* num
// 3*2[a+1]=2*num
// 3a+3=2*num
//  a = 2*num-3/3
// 63/3 21