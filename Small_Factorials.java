import java.util.Scanner;
public class factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int f=1;
            int n=sc.nextInt();
            for(int i=1;i<=n;i++)
            f=f*i;
        System.out.println(f);
        }
    }
}