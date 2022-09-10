import java.util.*;
class palindrome
{
	public static boolean ispalin(int n)
	{
		int d=(int)Math.log10(n);
		int flag=0;
		while(n>0)
		{
			if(n/(int)Math.pow(10,d)!=n%10)
			{
				flag=1;
				break;
			}
			n=n%(int)Math.pow(10,d);
			n=n/10;
			d=d-2;
		}
		if(flag==1)
			return false;

			return true;	
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int n=s.nextInt();
		    if(ispalin(n))
		        System.out.println("True");
		  else
		       System.out.println("False"); 
		}
	
	}
}