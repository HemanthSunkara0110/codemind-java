import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        while(n>9)
        {
        int sum=0;
        int rem=0;
          while(n!=0)
          {
          rem=n%10;
          sum+=rem;
          n=n/10;
          }
         n=sum;
        }
        System.out.println(n);
    }
}