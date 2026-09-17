class Solution {
    public boolean isSubsequence(String s, String t) {
        int len=s.length();
        int flag=0;
        for(int i=0;i<len;i++)
        {
            if(t.contains(String.valueOf(s.charAt(i))))
            {
               flag=1;
            }
            else
            {
                return false;
            }
           
        }
        if(flag==1)
        {
            return true;
        }
        return true;
    }
}