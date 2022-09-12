import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        for(int i=0;i<n;i++)
        {
              for(int j=0;j<n;j++)
              {
              if(i==j||j==n-i-1)
              
              System.out.print("x");
              else
                  System.out.print("0");
              }
              
                   System.out.println();
        }
     
        
         
    }
}