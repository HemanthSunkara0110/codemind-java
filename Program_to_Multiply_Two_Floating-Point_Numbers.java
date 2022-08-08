import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        float a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextFloat();
        b=s.nextFloat();
        
        System.out.printf("%.2f",a*b);
        
    }
}