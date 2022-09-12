import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        for(int i=n;i>0;i--)
        {
              for(int j=1;j<=n;j++)
              {
              if(i==j||j==n-i+1)
              
              System.out.print(i+" ");
              else
                  System.out.print(" ");
              }
              
                   System.out.println();
        }
     
        
         
    }
}