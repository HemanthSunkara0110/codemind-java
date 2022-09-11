import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int  i=0;i<n;i++)
        a[i]=s.nextInt();
        int i,c=0;
       
           for(i=0;i<n;i++)
           {
           if(a[i]%2==0)
           c++;
           
       }
       if(c>=n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}