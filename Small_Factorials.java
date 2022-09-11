import java.util.*;
class sol
{
    public static int fact(int n)
    {
        int f=1;
        for(int i=2;i<=n;i++)
            f=f*i;
        return f;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-- >0)
        {
            int n=s.nextInt();
            System.out.println(fact(n));
        }
    }
}