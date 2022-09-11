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
        int i,t=0;
         int k=s.nextInt();
       
           for(i=0;i<n;i++)
           {
           if(a[i]==k)
           t++;
           
       }if(t>0)
        System.out.println("True");
        else
           System.out.println("False");
    }
}