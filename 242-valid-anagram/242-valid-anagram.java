class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        int[] alp = new int[27];
        for( int i = 0 ; i < s.length() ; i++)
        {
            alp[s.charAt(i)-'a']++;
        }
        for( int i = 0 ; i < t.length() ; i++)
        {
            alp[t.charAt(i)-'a']--;
        }
        for(int i = 0 ; i < 27 ; i++)
        {
            if(alp[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}