import java.util.Scanner;
import java.util.*;
class otp
{
   public  static void main(String[] args)
   {

      int n;
      int sqr=1;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++)
      {
         if((i+1)%2==0)
         {
            sqr=sqr*arr[i];
         }
      }
      if(String.valueOf(sqr).length()<4)
      {
         System.out.println("-1");
      }
      else
      {
         System.out.println("the otp is:"+sqr);
      }
   }
}