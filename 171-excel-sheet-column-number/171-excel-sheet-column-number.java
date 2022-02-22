class Solution 
{
    public int titleToNumber(String s) 
    {
        char[] ch = s.toCharArray(); 
        int sum = 0;
        System.out.println(ch[0]);
        for(int i = 0 ; i < ch.length ; i++)
        {
            sum = sum*26;
            System.out.println(ch[i]);
            sum = sum + ch[i] - 'A' + 1;
        }
        return sum;
    }
}
// Z -> 26
// AA -> 26*1 + char - 'A' + 1
//     A -> 1
//     char = A;
//     char - 'A' = 0 ;
