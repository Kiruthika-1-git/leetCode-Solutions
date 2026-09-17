import java.util.Scanner;
import java.util.*;
class first
{
   public static void main(String[] args)
   {
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      }
      HashSet<Integer> s1=new HashSet<>();
      for(int i=0;i<n;i++)
      {
         if(s1.add(arr[i]))
         {
            continue;
         }
         else
         {
            System.out.println("the first repeating element is:"+arr[i]);
            break;
         }
      }
   }
}
