import java.util.Scanner;
class compound
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r,t,c;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        c=p*(Math.pow(1+(r/100),t));
        System.out.printf("%.2f",c);
    }
}