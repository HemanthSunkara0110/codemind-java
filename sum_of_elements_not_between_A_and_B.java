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
        int A=s.nextInt();
        int B=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<A||a[i]>B)
            sum+=a[i];
        }
        System.out.print(sum);
    }
}