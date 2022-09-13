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
         int b[]=new int[n];
         for(int i=0;i<n;i++)
            b[i]=s.nextInt();
         int c[]=new int[n];
         for(int i=0;i<n;i++)
            c[i]=a[i]+b[i];
         for(int i=0;i<n;i++)
            System.out.print(c[i]+" ");
       
       
    }
}