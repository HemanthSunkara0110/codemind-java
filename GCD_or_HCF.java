import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,min,gcd=0;
        a=sc.nextInt();
        b=sc.nextInt();
       
        if(a<b)
          min=a;
        else
          min=b;

       for(int i=min;i>0;i--)
        {
              if(a%i==0 && b%i==0)
               {
                  gcd=i;
                  break;
                }
        }
        System.out.println(gcd);
        sc.close();        
    }
}
