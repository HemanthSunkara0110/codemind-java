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
        int sum=0;
        Arrays.sort(a);
        for(int i=0;i<n-1;i++)
        {
        if(a[i]!=a[i+1]&&a[i]%2!=0)
        sum=sum+a[i];
        }
        if(a[n-1]%2!=0)
        sum=sum+a[n-1];
          System.out.println(sum);
    }
  
}