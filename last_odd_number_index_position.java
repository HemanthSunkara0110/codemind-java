import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int  i=0;i<n;i++)
            a[i]=s.nextInt();
        int i;
       
           for(i=n-1;i<0;i--)
           {
           if(a[i]%2!=0)
           break;
       }
        System.out.print(i);
    }
}