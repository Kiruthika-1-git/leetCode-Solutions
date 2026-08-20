import java.util.*;
import java.util.Stack;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        int found=0;
        String input="";
		
		while (sc.hasNext()) {
			 input=sc.next();
             found=0;
        
        Stack<Character> s1=new Stack<>();
        int len=input.length();
        for(int i=0;i<len;i++)
        {
            if(input.charAt(i)=='{' || input.charAt(i)=='[' || input.charAt(i)=='(')
            {
                s1.push(input.charAt(i));
            }
            else if(input.charAt(i)=='}' || input.charAt(i)==']' || input.charAt(i)==')')
            {
                if(s1.isEmpty())
                {
                    found=0;
                    break;
                }
            
                char a=s1.pop();
                if(a=='{' || a=='[' || a=='(' )
                {
                    found=1;
                    continue;
                }
        
                else
                {
                    found=0;
                    break;
                }
            }
            }
        
        
        if(found==1 && s1.isEmpty())
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
	}
}



