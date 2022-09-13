import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
         for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int k=s.nextInt();
        int f=-1;
        for(int i=0;i<n;i++)
        {
      
            if(a[i]==k)
            {
                f=i;
             
                break;
            }
        }
        System.out.print(f);
    }
}