import java.util.*;
class sample
{
    public static boolean isPrime(int n)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,sum=0,i,s=0;
        n1=sc.nextInt();
        n2=sc.nextInt();
        sum=n1+n2;
        for(i=sum+1;;i++)
        {
            s++;
            if(isPrime(i))
            break;
        
        }
        System.out.println(s);
    }
    
}