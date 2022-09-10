import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,digit,large=0;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        while(n>0)
        {
            digit=n%10;
            {
              if(large<digit)
              {
                  large=digit;
              }
            }
            n=n/10;
        }
        System.out.println(large);
    }
}