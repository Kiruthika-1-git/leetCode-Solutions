import java.util.Stack;
class Solution {

    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        int top=-1;
        int i=0;
        int len=s.length();
        while(i<len)
        {
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[')
            {
                s1.push(s.charAt(i));
                top++;
                i++;
            }
            else if(s.charAt(i)=='}' || s.charAt(i)==')' || s.charAt(i)==']')
            {
                if(s1.isEmpty())
                {
                    return false;
                }
                char a=s1.pop();
                top--;
                if((a=='{' && s.charAt(i)=='}') || (a=='[' && s.charAt(i)==']') || (a=='(' && s.charAt(i)==')'))
                {
                    i++;
                    continue;
                }
            
                else
               {
                return false;
               }
            }
        }

      return s1.isEmpty();  
    }
}