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
            int q=a/b;
            int r=a%b;
            System.out.println(q+r);
        }
    }
}