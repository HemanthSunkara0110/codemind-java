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
        int c=0;
        for(int i=0,j=1,k=2;k<n;k++,j++,i++)
        {
            if(a[i]%2!=0 && a[j]%2==0 && a[k]%2!=0 )
            c++;
        }
        System.out.print(c);
    }
}