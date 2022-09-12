import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[10];
        while(n!=0)
        {
            int t=n%10;
               a[t]++;
                n=n/10;
       
          }int flag=0;
          for(int i=0;i<10;i++)
          {
              if(a[i]>=2)
              {
              flag=1;
              break;
              }
          }
          if(flag==0)
          System.out.print("Unique Number");
          else
          System.out.print("Not Unique Number");
        
    }
}