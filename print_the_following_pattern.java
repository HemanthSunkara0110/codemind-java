import java.util.Scanner;
class Pattern18 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)		
		{    int k=i>n?n-i%n:i;
			for(int j=1;j<=2*n;j=j+1)	
			{
				if(j<=n-k)
					System.out.print(" ");
			}
			for(int p=1;p<=2*k-1;p++)
			{
					System.out.print(i);
			}
			System.out.println();
			}
			
			
		}
	
}