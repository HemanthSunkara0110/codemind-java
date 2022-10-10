import java.util.*;
class main
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
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(lcm(a,b));
    }
}