import java.util.Scanner;
class hemu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,v;
        n=sc.nextInt();
        m=sc.nextInt();
        v=sc.nextInt();
        System.out.print(n*m*v*512*2);
    }
}