import java.util.Scanner;
class palinprime
{
    public static boolean ispalindrome(int n)
    {
        int d=(int)Math.log10(n);
        int found=0;
        while(n>0)
        {
            if(n/(int)Math.pow(10,d)!=n%10)
            {
                found=1;
                break;
            }
            n=n%(int)Math.pow(10,d);
            n=n/10;
            d=d-2;
        }
        if(found==1)
          return false;
        else
            return true;
    }
    public static boolean isprime(int b)
    {
        for(int i=2;i<=(int)Math.sqrt(b);i++)
        {
            if(b%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        if(m%2==0)
        m=m+1;
        else
        m=m+2;
        for(int i=m;;i=i+2)
        {
            if(isprime(i)&&ispalindrome(i))
            {
                System.out.println(i);
                break;
            }
        }
    }
}