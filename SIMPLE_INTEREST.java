import java.util.Scanner;
class Simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,r,t,sim;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        sim=p*t*r/100;
        System.out.print(sim);
    }
}