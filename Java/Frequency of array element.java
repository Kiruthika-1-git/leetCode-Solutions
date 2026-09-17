import java.util.Scanner;
import java.util.*;
class frequency
{
   public static void main(String[] args)
   {
      int n;
      int count=0;
      System.out.println("enter how many elements");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++)
      {
         count=1;
         if(arr[i]==-1)
         {
            continue;
         }
         for(int j=i+1;j<n;j++)
         {
              if(arr[i]==arr[j])
              {
                 count=count+1;
                 arr[j]=-1;
              }
         }
         System.out.println(" the count of" +arr[i]+"is"+count);
      }
   }
}
