class Solution {
    public String longestCommonPrefix(String[] strs) {
        String m="";
        int flag=0;
        char ch;
        for(int i=0;i<strs[0].length();i++)
        {
             ch=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++)
            {
                if(i>=strs[j].length())
                {   return m;
                }
               if(strs[j].charAt(i)!=ch)
              {
                return m;
               }
               

        }
        m+=ch;
  
    }
    return m;
    
}
}