import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       int temp=n;
       int sq=n*n;
       int sum=0;
       int rem=0;
        while(sq!=0)
        {
            rem=sq%10;
            sum=sum+rem;
          
            sq=sq/10;
        }
        if(temp==sum)
        System.out.print("Neon Number");
        else
         System.out.print("Not Neon Number");
    }
}