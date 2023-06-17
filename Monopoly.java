import java.util.Scanner;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((a+b)<c ||(a+c)<b || (b+c)<a)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}