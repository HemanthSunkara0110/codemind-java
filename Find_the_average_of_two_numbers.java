import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        double c=(a+b)/(float)2;
        System.out.printf("%.4f",c);
        
    }
}