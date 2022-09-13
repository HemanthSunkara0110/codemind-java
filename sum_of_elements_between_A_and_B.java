import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
       
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
         int a=s.nextInt();
         int b=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
         if(arr[i]>=a&&arr[i]<=b)
         sum=sum+arr[i];
         
        }
        System.out.println(sum);
    }
}