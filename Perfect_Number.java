import java.util.*;
class main
{
    public static int findFactor(int x)
    {
        int sum=0;
        for (int i=1;i<=x/2;i++)
        {
            if(x%i==0)
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,result;
        n=sc.nextInt();
        result=findFactor(n);
        if(result==n)
        System.out.println("True");
        else
        System.out.println("False");
        
    }
}