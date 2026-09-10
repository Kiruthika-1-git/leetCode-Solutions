class Solution {
    public void reverseString(char[] s) {
        char[] s1=new char[s.length];
        int j=0;
        for(int i=0;i<s.length;i++)
        {
            s1[i]=s[i];
        }
        for(int i=s.length-1;i>=0;i--)
        {
            s[j]=s1[i];
            j++;
        }
        
    }
}