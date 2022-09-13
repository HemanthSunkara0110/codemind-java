
   import java.util.*;
class sol
{
    public static void rev(int a[],int i,int j)
    {
        while(i<j)
        {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
    public static void rotate(int a[],int n,int k)
    {
        if(k==0||k==n||n==1)
        return;
        k=k%n;
        rev(a,0,k-1);
        rev(a,k,n-1);
        rev(a,0,n-1);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        rotate(a,n,k);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}