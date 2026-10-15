import java.util.Scanner;
import java.util.*;
class arrange
{
   public static void main(String[] args)
   {
      String text;
      System.out.println("enter the string:");
      Scanner sc=new Scanner(System.in);
      text=sc.next();
      int len=text.length();
      int dig,let,spl;
      String last="";
      for(int i=0;i<len;i++)
      {
         if(Character.isLetter(text.charAt(i)))
         {
            last=last+String.valueOf(text.charAt(i));
         }
      }
      for(int i=0;i<len;i++)
      {
         if(Character.isDigit(text.charAt(i)))
         {
            last=last+String.valueOf(text.charAt(i));

         }
      }
      for(int i=0;i<len;i++)
      {
         if(!Character.isLetterOrDigit(text.charAt(i)) && !Character.isWhitespace(text.charAt(i)))
         {
            last=last+String.valueOf(text.charAt(i));
         }
      }
      System.out.println(last);
   }
}
