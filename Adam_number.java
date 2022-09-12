import java.util.*;
class sample
{  
    public static int rev(int n)
    {   int r=0;
        while(n!=0)
        {
          r=r*10+(n%10);
           n=n/10;
        }
       return r;
    }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int s1=n*n;
        int temp=rev(n);
        int s2=temp*temp;
        int t=rev(s2);
        if(s1==t)
        System.out.print("True");
        else
            System.out.print("False");
        }
}