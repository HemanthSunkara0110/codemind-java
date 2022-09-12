import java.util.*;
class sample
{
   public static void main(String args[]) 
   {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int temp=n;
       double sqrt=(int)Math.sqrt(n);
       if(sqrt*sqrt==n)
       System.out.print("True");
       else
           System.out.print("False");
   }
}