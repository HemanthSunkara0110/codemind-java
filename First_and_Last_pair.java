import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        for(int i=0,j=n-1;i<=j;i++,j--)
        {
            if(i<j)
            System.out.print(a[i]+" "+a[j]+" ");
            if(i==j)
            {
             System.out.print(a[i]+" "+0);
             break;
            }
        }
        
        
    }
}