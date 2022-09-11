import java.util.Scanner;
class Main
{
static int minAbsDiff(int n)
{
    int left = 1 << ((int)Math.floor(Math.log(n) / Math.log(2)));
    int right = left * 2;
    return Math.min((n - left), (right - n));
}
public static void main (String[] args)
{
    int n;
    Scanner Sc=new Scanner(System.in);
    n=Sc.nextInt();
    System.out.println(minAbsDiff(n));
}
}