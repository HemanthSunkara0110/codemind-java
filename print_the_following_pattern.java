import java.util.*;
class pattern
{
  public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int R;
	
	R=sc.nextInt();
	int k=R;
	for(int i=1;i<=R;i++)
	{
		for(int j=1;j<=k;j++)
		{
		System.out.print(j);
		
		}
		System.out.println();
		k--;
	}
	}
}