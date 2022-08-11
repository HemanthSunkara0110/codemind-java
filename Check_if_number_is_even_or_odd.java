import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        if(n%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}