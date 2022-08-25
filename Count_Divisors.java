import java.util.*;
class main
{
    public static int findDivisors(int l,int r,int k)
    {
        int count=0;
        for (int i=l;i<=r;i++)
        {
            if(i%k==0)
            count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,r,k,result;
        l=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        result=findDivisors(l,r,k);
        
        System.out.println(result);
        
        
    }
}