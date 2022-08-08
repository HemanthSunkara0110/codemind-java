import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int r;
        Scanner s=new Scanner(System.in);
        r=s.nextInt();
        double area=3.14*r*r;
        System.out.printf("%.2f",area);
    }
}