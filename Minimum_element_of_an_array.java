import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int min=0;
int temp=a[0];
	 for(int i=0;i<n;i++)

	{
	 if(temp>a[i])
	temp=a[i];
				
				
}

        System.out.println(temp);
    }
}