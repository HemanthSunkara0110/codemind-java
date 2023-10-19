import java.util.*;
public class sol
{
    public static int lcm(int a,int b)
    {
        int m=a>b?a:b;
        int l=m;
        while(true)
        {
            if(l%a==0 && l%b==0)
            break;
            l=l+m;
        }
        return l;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-- >0)
        {
            long q=s.nextLong();
            int a=s.nextInt();
            int b=s.nextInt();
            int k=s.nextInt();
            int c=(int)q/a +(int)q/b-2*(int)q/lcm(a,b);
            if(c>=k)
                System.out.println("Win");
            else
                System.out.println("Lose");
        }
    }
}