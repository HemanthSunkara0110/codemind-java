import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        if(n>0)
        System.out.println("Positive Number");
        else
        System.out.println("Negative Number");
    }
}