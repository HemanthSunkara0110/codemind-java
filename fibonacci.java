import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,a=0,b=1,c,count=3;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        c=a+b;
        System.out.print(a+" "+b+" ");
        while(count<=n)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            count++;
        }
        
    }
}