import java.util.*;
class sol
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
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.print(lcm(a,b));
        
    }
}