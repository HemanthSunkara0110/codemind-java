import java.util.Scanner;
class pattern 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r;
		
		r=sc.nextInt();
		int k=r;
			for(int i=1;i<=r;i++)		
		{   
			for(int j=1;j<=k;j++)
			{
			    
				System.out.print((char)(65+r-i)+" ");
							
			}
			System.out.println();
		k--;
		}
	}
}