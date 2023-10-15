import java.util.Scanner;
public class tables{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=1;i<=m;i=i+2){
            System.out.println(n +" x "+ i +" = "+ n*i);
        }
    }
}