class Solution 
{
    public int numberOfBeams(String[] bank) 
    {
        int n = 0;
        n= bank[0].length();
        
        
        System.out.println(n);
        
        
        int count =0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for( int i = 0 ; i < bank.length ; i++)
        {
            count = 0;
            for(int j = 0 ; j < n ; j++)
            {
                if(bank[i].charAt(j)=='1')
                {
                    count++;
                }
            }
            if(count>0)
            list.add(count);
        }
        int ans= 0;
        for(int i = 0 ; i < list.size()-1 ; i++)
        {
            ans = ans + list.get(i)*list.get(i+1);
        }
        return ans;
    }
}
// public int numberOfBeams(String[] bank) {
//         List<Integer> freq=new ArrayList<>();
//         int index=0;
//         for(String s: bank){
//             int count=0;
//             for(char ch: s.toCharArray()){
//                 if(ch=='1'){
//                     count++;
//                 }
//             }
//             if(count>0){
//                 freq.add(count);
//             }
//         }
//         int res=0;
//         for(int i=0;i<freq.size()-1;i++){
//             int temp=freq.get(i)*freq.get(i+1);
//             res+=temp;
//         }
//         return res;
        
//     }