import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int rem=0;
       int temp=n;
       for (int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            sum+=i;
        }
        if(temp==sum)
        
        System.out.println("True");
        else
         System.out.println("False");
    
        
    }
}