import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r,t,com;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        com= p*(Math.pow((1+r/100),t));
        System.out.printf("%.2f",com);
    }
}